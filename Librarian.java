package librarian_book;

import java.util.Date;

public class Librarian {
    private long id;
    private String name;
    private String password;
    private String email;
    private String address;
    private String city;
    private String contact;

    public Librarian(long id, String name, String password, String email, String address, String city, String contact) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.address = address;
        this.city = city;
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Librarian librarian = (Librarian) o;

        if (id != librarian.id) return false;
        if (!name.equals(librarian.name)) return false;
        if (!email.equals(librarian.email)) return false;
        if (!address.equals(librarian.address)) return false;
        if (!city.equals(librarian.city)) return false;
        return contact.equals(librarian.contact);
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + name.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + address.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + contact.hashCode();
        return result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
