package librarian_book;

public class UserDAO {

    public User[] librarians = new User[3];

    public User[] getLibrarians() {
        return librarians;
    }

    public User addLibrarian(User user)throws Exception{
        if (user == null)
            throw new Exception("Such an object does not exist" );

        if (user.getUserType() != UserType.LIBRARIAN)
            throw new Exception("Can not add this user - " + user.getName() + ", because he is not a librarian");

        if (checkIsFull() == 0)
            throw new Exception("Can not save librarian " + user.getId() + " libraryBooks is full");

        if (!checkLibrarian(user))
            throw new Exception("Can not be saved. " + user.getId() + " already exists");

        int index = 0;
        for (User user1 : librarians) {
            if (user1 == null){
                librarians[index] = user;
                return librarians[index];
            }
            index++;
        }
        throw new Exception("Can not save book " + user.getId());
    }

    public void deleteLibrarian(User user)throws Exception{
        if (user == null)
            throw new Exception("Such an object does not exist" );

        if (checkLibrarian(user))
            throw new Exception("Can not be deleted. The librarian - " + user.getId() + " not exist.");

        int index = 0;
        for (User user1 : librarians) {
            if (user1 != null && user1.equals(user)){
                librarians[index] = null;
            }
            index++;
        }
    }

    public User[] viewLibrarianList()throws Exception{
        if (librarians == null)
            throw new Exception("There is no such object");

        int count = 0;
        for (User el : librarians) {
            if (el != null){
                count++;
            }
        }

        User[] result = new User[count];
        int index = 0;
        for (User el : librarians) {
            if (el != null){
                result[index] = el;
                index++;
            }
        }
        return result;
    }

    private boolean checkLibrarian(User user)throws Exception{
        if (user == null)
            throw new Exception("Such an object does not exist" );

        int index = 0;
        for (User librarian : librarians) {
            if (librarian != null && librarian.getUserType() == UserType.LIBRARIAN && librarian.equals(user)){
                return false;
            }
            index++;
        }
        return true;
    }

    private int checkIsFull()throws Exception{
        if (librarians == null)
            throw new Exception("There is no such object");

        int index = 0;
        int countNull = 0;
        for (User librarian : librarians) {
            if (librarian ==  null){
                countNull++;
            }
            index++;
        }
        return countNull;
    }
}
