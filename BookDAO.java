package librarian_book;

public class BookDAO {

    public Book[] librarian = new Book[10];

    public Book[] getLibrarian() {
        return librarian;
    }

    public Book addBookInLibrarian(Book book)throws Exception{
        if (book == null)
            throw new Exception("Such an object does not exist" );

        if (checkIsFull() == 0)
            throw new Exception("Can not save book " + book.getId() + " librarian is full");

        if (!checkBook(book))
            throw new Exception("Can not be saved. The book " + book.getId() + " already exists");

        int index = 0;
        for (Book book1 : librarian) {
            if (book1 == null){
                librarian[index] = book;
                return librarian[index];
            }
            index++;
        }
        throw new Exception("Can not save book " + book.getId());
    }

    public Book[] viewBook()throws Exception{
        if (librarian == null)
            throw new Exception("There is no such object");

        int count = 0;
        for (Book el : librarian) {
            if (el != null){
                count++;
            }
        }

        Book[] result = new Book[count];
        int index = 0;
        for (Book el : librarian) {
            if (el != null){
                result[index] = el;
            }
            index++;
        }
        return result;
    }

    private boolean checkBook(Book book)throws Exception{
        if (book == null)
            throw new Exception("Such an object does not exist" );

        int index = 0;
        for (Book book1 : librarian) {
            if (book1 != null && book1.equals(book)){
                return false;
            }
            index++;
        }
        return true;
    }

    private int checkIsFull(){
        int index = 0;
        int countNull = 0;
        for (Book book : librarian) {
            if (book ==  null){
                countNull++;
            }
            index++;
        }
        return countNull;
    }
}
