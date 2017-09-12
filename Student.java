package librarian_book;

public class Student {
    private String bookCallNo;
    private long id;
    private String name;
    private String contact;

    public Student(long id, String name, String bookCallNo, String contact) {
        this.bookCallNo = bookCallNo;
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (id != student.id) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + name.hashCode();
        return result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "bookCallNo='" + bookCallNo + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
