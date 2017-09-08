package librarian_book;

public class Librarian {
    private long id;
    private String name;
    private String password;
    private String em;
    private String address;
    private String city;
    private String contactNumber;
    private String[] librarian;
    private String[] issuedLibrarian;

    public Librarian(long id, String name, String password, String em, String address, String city, String contactNumber, String[] librarian, String[] issuedLibrarian) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.em = em;
        this.address = address;
        this.city = city;
        this.contactNumber = contactNumber;
        this.librarian = librarian;
        this.issuedLibrarian = issuedLibrarian;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEm() {
        return em;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public String[] getLibrarian() {
        return librarian;
    }

    public String[] getIssuedLibrarian() {
        return issuedLibrarian;
    }
}
