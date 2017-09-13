package librarian_book;

import java.util.Arrays;

public class Student {
    private String bookCallNo;
    private long idStudent;
    private String name;
    private String contact;
    private Book[] studentBooks;

    public Student(String bookCallNo, long idStudent, String name, String contact, Book[] studentBooks) {
        this.bookCallNo = bookCallNo;
        this.idStudent = idStudent;
        this.name = name;
        this.contact = contact;
        this.studentBooks = studentBooks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (idStudent != student.idStudent) return false;
        return name.equals(student.name);
    }

    @Override
    public int hashCode() {
        int result = (int) (idStudent ^ (idStudent >>> 32));
        result = 31 * result + name.hashCode();
        return result;
    }

    public long getIdStudent() {
        return idStudent;
    }

    public void setIdStudent(long idStudent) {
        this.idStudent = idStudent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getStudentBooks() {
        return studentBooks;
    }

    public void setStudentBooks(Book[] studentBooks) {
        this.studentBooks = studentBooks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "bookCallNo='" + bookCallNo + '\'' +
                ", id=" + idStudent +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", studentBooks=" + Arrays.toString(studentBooks) +
                '}';
    }
}
