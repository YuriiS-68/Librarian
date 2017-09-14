package librarian_book;

import java.util.Date;

public class Book {
    private long idBook;
    private String callNumber;
    private String name;
    private String author;
    private String publisher;
    private BookType bookType;
    private Date addedDate;
    private Date issuedDate;
    private Student student;

    public Book(long idBook, String callNumber, String name, String author, String publisher, BookType bookType, Date addedDate, Date issuedDate, Student student) {
        this.idBook = idBook;
        this.callNumber = callNumber;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.bookType = bookType;
        this.addedDate = addedDate;
        this.issuedDate = issuedDate;
        this.student = null;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public long getIdBook() {
        return idBook;
    }

    public void setIdBook(long idBook) {
        this.idBook = idBook;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public Date getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(Date issuedDate) {
        this.issuedDate = issuedDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", callNumber='" + callNumber + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", bookType=" + bookType +
                ", addedDate=" + addedDate +
                ", issuedDate=" + issuedDate +
                ", student=" + student +
                '}';
    }
}
