package librarian_book;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args)throws Exception {
        BookDAO bookDAO = new BookDAO();

        Book book1 = new Book(1, "909", "name1", "author1", "publisher1", BookType.AVAILABLE, 05, 01, new Date(), new Date());
        Book book2 = new Book(2, "909", "name2", "author2", "publisher2", BookType.AVAILABLE, 05, 01, new Date(),new Date());
        Book book3 = new Book(3, "909", "name3", "author3", "publisher3", BookType.AVAILABLE, 05, 01, new Date(),new Date());
        Book book4 = new Book(4, "909", "name4", "author4", "publisher4", BookType.AVAILABLE, 05, 01, new Date(),new Date());
        Book book5 = new Book(5, "909", "name5", "author5", "publisher5", BookType.AVAILABLE, 05, 01, new Date(),new Date());
        Book book6 = new Book(6, "909", "name6", "author6", "publisher6", BookType.AVAILABLE, 05, 01, new Date(),new Date());
        Book book7 = new Book(7, "909", "name7", "author7", "publisher7", BookType.AVAILABLE, 05, 01, new Date(),new Date());
        Book book8 = new Book(8, "909", "name8", "author8", "publisher8", BookType.AVAILABLE, 05, 01, new Date(),new Date());
        Book book9 = new Book(9, "909", "name9", "author9", "publisher9", BookType.AVAILABLE, 05, 01, new Date(),new Date());
        Book book10 = new Book(10, "909", "name10", "author10", "publisher10", BookType.AVAILABLE, 05, 01, new Date(),new Date());

        bookDAO.addBookInLibrarian(book1);
        bookDAO.addBookInLibrarian(book2);
        bookDAO.addBookInLibrarian(book3);
        //bookDAO.addBookInLibrarian(book4);
        //bookDAO.addBookInLibrarian(book5);
        //bookDAO.addBookInLibrarian(book6);
        //bookDAO.addBookInLibrarian(book7);
        //bookDAO.addBookInLibrarian(book8);
        //bookDAO.addBookInLibrarian(book9);
        //bookDAO.addBookInLibrarian(book10);
        //bookDAO.addBookInLibrarian(book10);
        System.out.println(Arrays.toString(bookDAO.viewBooksList()));

        bookDAO.issueBook(book1);
        //System.out.println(book2);
        //System.out.println(book3);
        bookDAO.issueBook(book2);
        bookDAO.issueBook(book3);
        //System.out.println(book2);
        System.out.println();
        System.out.println(Arrays.toString(bookDAO.viewIssuedBooksList()));

        bookDAO.returnBook(book2);
        System.out.println(Arrays.toString(bookDAO.viewBooksList()));



    }
}