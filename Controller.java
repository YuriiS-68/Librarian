package librarian_book;

public class Controller {
    public void addBooks(Book book)throws Exception{
        if (book == null)
            throw new Exception("Such an object does not exist" );

    }

    public void viewBook(Librarian[] librarians, Book book)throws Exception{
        if (librarians == null || book == null)
            throw new Exception("Such an object does not exist" );

    }

    public void issueBooks(Book book){

    }

    public void viewIssuedBooks(Book book){

    }

    public void returnBooks(Book book){

    }
}
