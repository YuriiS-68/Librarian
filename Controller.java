package librarian_book;

public class Controller {
    //проверить свободное место в библиотеке
    //проверить есть ли уже в библиотеке такая книга
    //добавляем книгу
    public void addBooks(Book book)throws Exception{
        if (book == null)
            throw new Exception("Such an object does not exist" );

    }

    public void viewBook(Librarian[] librarians)throws Exception{
        if (librarians == null)
            throw new Exception("Such an object does not exist" );

    }

    public void issueBooks(Book book){

    }

    public void viewIssuedBooks(Book book){

    }

    public void returnBooks(Book book){

    }
}
