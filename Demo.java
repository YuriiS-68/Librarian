package librarian_book;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args)throws Exception {

        UserDAO userDAO = new UserDAO();
        User librarian1 = new User(01, "librarian1", "1111", "1@email", "address1", "city1", "101", UserType.LIBRARIAN);
        User librarian2 = new User(02, "librarian2", "2222", "2@email", "address2", "city2", "202", UserType.LIBRARIAN);
        User librarian3 = new User(03, "librarian3", "3333", "3@email", "address3", "city3", "303", UserType.LIBRARIAN);
        User librarian = new User(00, "admin", "0000", "0@email", "address", "city", "000", UserType.ADMIN);

        Book[] libraryStudent = new Book[5];
        Student student1 = new Student("K8", 01, "student1", "909111", libraryStudent);
        Student student2 = new Student("U5", 02, "student2", "909222", libraryStudent);

        BookDAO bookDAO = new BookDAO();
        Book book1 = new Book(1, "901", "name1", "author1", "publisher1", BookType.AVAILABLE, new Date(), new Date(), null);
        Book book2 = new Book(2, "902", "name2", "author2", "publisher2", BookType.AVAILABLE, new Date(), new Date(), null);
        Book book3 = new Book(3, "903", "name3", "author3", "publisher3", BookType.AVAILABLE, new Date(), new Date(), null);
        Book book4 = new Book(4, "904", "name4", "author4", "publisher4", BookType.AVAILABLE, new Date(), new Date(), null);
        Book book5 = new Book(5, "905", "name5", "author5", "publisher5", BookType.AVAILABLE, new Date(), new Date(), null);
        Book book6 = new Book(6, "906", "name6", "author6", "publisher6", BookType.AVAILABLE, new Date(), new Date(), null);
        Book book7 = new Book(7, "907", "name7", "author7", "publisher7", BookType.AVAILABLE, new Date(), new Date(), null);
        Book book8 = new Book(8, "908", "name8", "author8", "publisher8", BookType.AVAILABLE, new Date(), new Date(), null);
        Book book9 = new Book(9, "909", "name9", "author9", "publisher9", BookType.AVAILABLE, new Date(), new Date(), null);
        Book book10 = new Book(10, "910", "name10", "author10", "publisher10", BookType.AVAILABLE, new Date(), new Date(), null);

        bookDAO.addBookInLibrarian(book1);
        bookDAO.addBookInLibrarian(book2);
        bookDAO.addBookInLibrarian(book3);
        bookDAO.addBookInLibrarian(book4);
        bookDAO.addBookInLibrarian(book5);
        bookDAO.addBookInLibrarian(book6);
        bookDAO.addBookInLibrarian(book7);
        bookDAO.addBookInLibrarian(book8);
        bookDAO.addBookInLibrarian(book9);
        bookDAO.addBookInLibrarian(book10);
        System.out.println(Arrays.toString(bookDAO.viewBooksList()));

        System.out.println();

        bookDAO.issueBook(book1, student2);
        bookDAO.issueBook(book2, student1);
        System.out.println(Arrays.toString(bookDAO.viewIssuedBooksList()));

        System.out.println();

        bookDAO.returnBook(book1, student2);
        System.out.println(Arrays.toString(bookDAO.viewIssuedBooksList()));
        System.out.println(Arrays.toString(bookDAO.viewBooksList()));

        System.out.println();

        userDAO.addLibrarian(librarian1);
        userDAO.addLibrarian(librarian2);
        userDAO.addLibrarian(librarian3);
        System.out.println(Arrays.toString(userDAO.viewLibrarianList()));

        System.out.println();

        userDAO.deleteLibrarian(librarian2);
        System.out.println(Arrays.toString(userDAO.viewLibrarianList()));

        System.out.println();

        userDAO.deleteLibrarian(librarian1);
        userDAO.deleteLibrarian(librarian3);
        System.out.println(Arrays.toString(userDAO.viewLibrarianList()));

        System.out.println();

        userDAO.addLibrarian(librarian);
        System.out.println(Arrays.toString(userDAO.viewLibrarianList()));
    }
}