package librarian_book;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args)throws Exception {

        Book[] libraryStudent = new Book[5];

        Student student1 = new Student("K8", 01, "student1", "909111", libraryStudent);
        Student student2 = new Student("U5", 02, "student2", "909222", libraryStudent);

        BookDAO bookDAO = new BookDAO();

        Book book1 = new Book(1, "901", "name1", "author1", "publisher1", BookType.AVAILABLE, new Date(), new Date(), student1);
        Book book2 = new Book(2, "902", "name2", "author2", "publisher2", BookType.AVAILABLE, new Date(), new Date(), student1);
        Book book3 = new Book(3, "903", "name3", "author3", "publisher3", BookType.AVAILABLE, new Date(), new Date(), student1);
        Book book4 = new Book(4, "904", "name4", "author4", "publisher4", BookType.AVAILABLE, new Date(), new Date(), student1);
        Book book5 = new Book(5, "905", "name5", "author5", "publisher5", BookType.AVAILABLE, new Date(), new Date(), student1);
        Book book6 = new Book(6, "906", "name6", "author6", "publisher6", BookType.AVAILABLE, new Date(), new Date(), student1);
        Book book7 = new Book(7, "907", "name7", "author7", "publisher7", BookType.AVAILABLE, new Date(), new Date(), student1);
        Book book8 = new Book(8, "908", "name8", "author8", "publisher8", BookType.AVAILABLE, new Date(), new Date(), student1);
        Book book9 = new Book(9, "909", "name9", "author9", "publisher9", BookType.AVAILABLE, new Date(), new Date(), student1);
        Book book10 = new Book(10, "910", "name10", "author10", "publisher10", BookType.AVAILABLE, new Date(), new Date(), student1);

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


    }
}