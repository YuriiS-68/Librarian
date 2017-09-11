package librarian_book;

import java.util.Date;

public class Book {
    private long id;
    private String callNumber;
    private String name;
    private String author;
    private String publisher;
    private BookType bookType;
    private int quantity;
    private int issued;
    private Date addedDate;
    private Date issuedDate;

    public Book(long id, String callNumber, String name, String author, String publisher, BookType bookType, int quantity, int issued, Date addedDate, Date issuedDate) {
        this.id = id;
        this.callNumber = callNumber;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.bookType = bookType;
        this.quantity = quantity;
        this.issued = issued;
        this.addedDate = addedDate;
        this.issuedDate = issuedDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getIssued() {
        return issued;
    }

    public void setIssued(int issued) {
        this.issued = issued;
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
                "id=" + id +
                ", callNumber='" + callNumber + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", bookType=" + bookType +
                ", quantity=" + quantity +
                ", issued=" + issued +
                ", addedDate=" + addedDate +
                ", issuedDate=" + issuedDate +
                '}';
    }
}
