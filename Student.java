package librarian_book;

public class Student {
    private long id;
    private String name;
    private String contact;

    public Student(long id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
