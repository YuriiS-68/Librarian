package librarian_book;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args)throws Exception {
        LibrarianDAO librarianDAO = new LibrarianDAO();

        Book book1 = new Book(1, "909", "name1", "author1", "publisher1", 01, 05, new Date());
        Book book2 = new Book(2, "909", "name2", "author2", "publisher2", 01, 05, new Date());
        Book book3 = new Book(3, "909", "name3", "author3", "publisher3", 01, 05, new Date());
        Book book4 = new Book(4, "909", "name4", "author4", "publisher4", 01, 05, new Date());
        Book book5 = new Book(5, "909", "name5", "author5", "publisher5", 01, 05, new Date());
        Book book6 = new Book(6, "909", "name6", "author6", "publisher6", 01, 05, new Date());
        Book book7 = new Book(7, "909", "name7", "author7", "publisher7", 01, 05, new Date());
        Book book8 = new Book(8, "909", "name8", "author8", "publisher8", 01, 05, new Date());
        Book book9 = new Book(9, "909", "name9", "author9", "publisher9", 01, 05, new Date());
        Book book10 = new Book(10, "909", "name10", "author10", "publisher10", 01, 05, new Date());

        librarianDAO.addBookInLibrarian(book1);
        librarianDAO.addBookInLibrarian(book2);
        librarianDAO.addBookInLibrarian(book3);
        librarianDAO.addBookInLibrarian(book4);
        librarianDAO.addBookInLibrarian(book5);
        librarianDAO.addBookInLibrarian(book6);
        librarianDAO.addBookInLibrarian(book7);
        librarianDAO.addBookInLibrarian(book8);
        librarianDAO.addBookInLibrarian(book9);
        //librarianDAO.addBookInLibrarian(book10);
        librarianDAO.addBookInLibrarian(book10);
        System.out.println(Arrays.toString(librarianDAO.viewBook()));

        librarianDAO.deleteBook(book5);
        System.out.println();
        System.out.println(Arrays.toString(librarianDAO.viewBook()));


    }
}