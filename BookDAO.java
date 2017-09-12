package librarian_book;

import java.util.Date;

public class BookDAO {

    public Book[] libraryBooks = new Book[10];
    public Book[] getLibraryBooks() {
        return libraryBooks;
    }

    public Student[] studentBooks = new Student[5];
    public Student[] getStudentBooks() {
        return studentBooks;
    }

    public Book addBookInLibrarian(Book book)throws Exception{
        if (book == null)
            throw new Exception("Such an object does not exist" );

        if (checkIsFull() == 0)
            throw new Exception("Can not save book " + book.getId() + " libraryBooks is full");

        if (!checkBook(book))
            throw new Exception("Can not be saved. The book " + book.getId() + " already exists");

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
        throw new Exception("Can not save book " + book.getId());
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
        if (book == null && student == null)
            throw new Exception("Such an object does not exist" );

        if (checkBook(book))
            throw new Exception("Can not be issued. The book " + book.getId() + " not exist");

        if (checkStudent(student))
            throw new Exception("Can not be issued. The book " + book.getId() + " not exist");

        if (checkBookOnStudent(book))
            throw new Exception("Can not be issued. The book " + book.getId() + " already issued.");

        int index = 0;
        for (Book book1 : libraryBooks) {
            if (book1 != null && book1.equals(book)){
                    libraryBooks[index] = book;
                    book.setBookType(BookType.ISSUED);
                    book.setIssuedDate(new Date());
                    return libraryBooks[index];
            }
            index++;
        }

        for (int i = 0; i < libraryBooks.length; i++) {
            for (int j = 0; j < studentBooks.length; j++) {
                if (libraryBooks[i].equals(book) && studentBooks[j] == null){
                    //studentBooks[j] = libraryBooks[i];
                }
            }
        }
        throw new Exception("Can not issue book " + book.getId());
    }

    public Book returnBook(Book book)throws Exception{
        if (book == null)
            throw new Exception("Such an object does not exist" );

        int index = 0;
        for (Book book1 : libraryBooks) {
            if (book1 != null && book1.equals(book)){
                libraryBooks[index] = book;
                book.setBookType(BookType.AVAILABLE);
                return libraryBooks[index];
            }
            index++;
        }
        throw new Exception("Can not return book " + book.getId());
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

    private boolean checkStudent(Student student)throws Exception{
        if (student == null)
            throw new Exception("Such an object does not exist" );

        int index = 0;
        for (Student student1 : studentBooks) {
            if (student1 != null && student1.equals(student)){
                return false;
            }
            index++;
        }
        return true;
    }

    private boolean checkBookOnStudent(Book book)throws Exception{
        if (book == null || studentBooks == null)
            throw new Exception("Such an object does not exist" );

        int index = 0;
        for (Student student1 : studentBooks) {
            if (student1 != null && !student1.equals(book)){
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
