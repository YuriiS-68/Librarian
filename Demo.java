package librarian_book;

import java.util.Arrays;
import java.util.Date;

public class Demo {
    public static void main(String[] args)throws Exception {

        Book[] libraryStudent = new Book[5];

        Student student1 = new Student("K8", 01, "student1", "909111", libraryStudent, );

        BookDAO bookDAO = new BookDAO();

        Book book1 = new Book(1, "909", "name1", "author1", "publisher1", BookType.AVAILABLE, new Date(), new Date(), student1);
        Book book2 = new Book(2, "909", "name2", "author2", "publisher2", BookType.AVAILABLE, new Date(), new Date(), student1);
        Book book3 = new Book(3, "909", "name3", "author3", "publisher3", BookType.AVAILABLE, new Date(), new Date(), student1);
        Book book4 = new Book(4, "909", "name4", "author4", "publisher4", BookType.AVAILABLE, new Date(), new Date(), student1);
        Book book5 = new Book(5, "909", "name5", "author5", "publisher5", BookType.AVAILABLE, new Date(), new Date(), student1);
        Book book6 = new Book(6, "909", "name6", "author6", "publisher6", BookType.AVAILABLE, new Date(), new Date(), student1);
        Book book7 = new Book(7, "909", "name7", "author7", "publisher7", BookType.AVAILABLE, new Date(), new Date(), student1);
        Book book8 = new Book(8, "909", "name8", "author8", "publisher8", BookType.AVAILABLE, new Date(), new Date(), student1);
        Book book9 = new Book(9, "909", "name9", "author9", "publisher9", BookType.AVAILABLE, new Date(), new Date(), student1);
        Book book10 = new Book(10, "909", "name10", "author10", "publisher10", BookType.AVAILABLE, new Date(), new Date(), student1);


    }
}