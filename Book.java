package librarian_book;

import java.util.Date;

public class Book {
    private long id;
    private String callNumber;
    private String name;
    private String author;
    private String publisher;
    private int quantity;
    private int issued;
    private Date addedDate;

    public Book(long id, String callNumber, String name, String author, String publisher, int quantity, int issued, Date addedDate) {
        this.id = id;
        this.callNumber = callNumber;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
        this.issued = issued;
        this.addedDate = addedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (id != book.id) return false;
        if (!callNumber.equals(book.callNumber)) return false;
        if (!name.equals(book.name)) return false;
        if (!author.equals(book.author)) return false;
        return publisher.equals(book.publisher);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + callNumber.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + author.hashCode();
        result = 31 * result + publisher.hashCode();
        return result;
    }

    public long getId() {
        return id;
    }

    public String getCallNumber() {
        return callNumber;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getIssued() {
        return issued;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", callNumber='" + callNumber + '\'' +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", quantity=" + quantity +
                ", issued=" + issued +
                ", addedDate=" + addedDate +
                '}';
    }
}
