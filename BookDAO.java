package librarian_book;

import java.util.Date;

public class BookDAO {

    public Book[] libraryBooks = new Book[10];
    public Book[] getLibraryBooks() {
        return libraryBooks;
    }

    public Book addBookInLibrarian(Book book)throws Exception{
        if (book == null)
            throw new Exception("Such an object does not exist" );

        if (checkIsFull() == 0)
            throw new Exception("Can not save book " + book.getIdBook() + " libraryBooks is full");

        if (!checkBook(book))
            throw new Exception("Can not be saved. The book " + book.getIdBook() + " already exists");

        int index = 0;
        for (Book book1 : libraryBooks) {
            if (book1 == null){
                libraryBooks[index] = book;
                book.setBookType(BookType.AVAILABLE);
                book.setAddedDate(new Date());
                return libraryBooks[index];
            }
            index++;
        }
        throw new Exception("Can not save book " + book.getIdBook());
    }

    public Book[] viewBooksList()throws Exception{
        if (libraryBooks == null)
            throw new Exception("There is no such object");

        int count = 0;
        for (Book el : libraryBooks) {
            if (el != null){
                count++;
            }
        }

        Book[] result = new Book[count];
        int index = 0;
        for (Book el : libraryBooks) {
            if (el != null){
                result[index] = el;
            }
            index++;
        }
        return result;
    }

    public Book[] viewIssuedBooksList()throws Exception{
        if (libraryBooks == null)
            throw new Exception("There is no such object");

        int count = 0;
        for (Book el : libraryBooks) {
            if (el != null && el.getBookType() == BookType.ISSUED){
                count++;
            }
        }

        Book[] result = new Book[count];
        int index = 0;
        for (Book el : libraryBooks) {
            if (el != null && el.getBookType() == BookType.ISSUED){
                result[index] = el;
                index++;
            }
        }
        return result;
    }

    public Book issueBook(Book book, Student student)throws Exception{
        if (book == null || student == null)
            throw new Exception("Such an object does not exist" );

        if (checkBook(book))
            throw new Exception("Can not be issued. The book " + book.getIdBook() + " not exist");

        if (!checkBookStudent(book, student))
            throw new Exception("Can not be saved. The book " + book.getIdBook() + " already exists");

        for (int i = 0; i < libraryBooks.length; i++) {
            if (libraryBooks[i] != null && libraryBooks[i].equals(book)){
                libraryBooks[i].setBookType(BookType.ISSUED);
                libraryBooks[i].setIssuedDate(new Date());
                for (int j = 0; j < student.getStudentBooks().length; j++) {
                    if (student.getStudentBooks()[j] == null){
                        student.getStudentBooks()[j] = book;
                        book.setStudent(student);
                        System.out.println("Book with id - " + book.getIdBook() + " issued successfully to student - " + student.getName());
                        return libraryBooks[i];
                    }
                }
            }else
                if (libraryBooks[i] != null && libraryBooks[i].getBookType() == BookType.ISSUED && libraryBooks[i].equals(book)){
                System.out.println("Book with id - " + book.getIdBook() + " is not available now.");
            }
        }
        throw new Exception("Failed to issue book with id - " + book.getIdBook());
    }

    public void returnBook(Book book, Student student)throws Exception{
        if (book == null || student == null)
            throw new Exception("Such an object does not exist" );

        if (checkBookStudent(book, student))
            throw new Exception("Can not return book " + book.getIdBook() + " The " + student.getName() + " has no such book.");

        int index = 0;
        for (Book book1 : libraryBooks) {
            if (book1 != null && book1.equals(book)){
                book.setBookType(BookType.AVAILABLE);
                book.getStudent().setIdStudent(0);
            }
            index++;
        }
        System.out.println("Book with id - " + book.getIdBook() + " was returned by the student " + student.getName());
    }

    private boolean checkBookStudent(Book book, Student student)throws Exception{
        if (book == null || student == null)
            throw new Exception("Such an object does not exist" );

        int index = 0;
        for (Book book1 : student.getStudentBooks()){
            if (book1 != null && book1.equals(book) && book.getStudent().equals(student)){
                return false;
            }
        }
        return true;
    }

    private boolean checkBook(Book book)throws Exception{
        if (book == null)
            throw new Exception("Such an object does not exist" );

        int index = 0;
        for (Book book1 : libraryBooks) {
            if (book1 != null && book1.equals(book)){
                return false;
            }
            index++;
        }
        return true;
    }

    private int checkIsFull()throws Exception{
        if (libraryBooks == null)
            throw new Exception("There is no such object");

        int index = 0;
        int countNull = 0;
        for (Book book : libraryBooks) {
            if (book ==  null){
                countNull++;
            }
            index++;
        }
        return countNull;
    }
}
