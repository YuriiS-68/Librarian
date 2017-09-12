package librarian_book;

public class LibrarianDAO {

    public Librarian[] librarians = new Librarian[5];

    public Librarian[] getLibrarians() {
        return librarians;
    }

    public Librarian addLibrarian(Librarian librarian)throws Exception{
        if (librarian == null)
            throw new Exception("Such an object does not exist" );

        if (checkIsFull() == 0)
            throw new Exception("Can not save librarian " + librarian.getId() + " libraryBooks is full");

        if (!checkLibrarian(librarian))
            throw new Exception("Can not be saved. " + librarian.getId() + " already exists");

        int index = 0;
        for (Librarian librarian1 : librarians) {
            if (librarian1 == null){
                librarians[index] = librarian;
                return librarians[index];
            }
            index++;
        }
        throw new Exception("Can not save book " + librarian.getId());
    }

    public void deleteLibrarian(Librarian librarian)throws Exception{
        if (librarian == null)
            throw new Exception("Such an object does not exist" );

        if (checkLibrarian(librarian))
            throw new Exception("Can not be deleted. The librarian - " + librarian.getId() + " not exist.");

        int index = 0;
        for (Librarian librarian1 : librarians) {
            if (librarian1 != null && librarian1.equals(librarian)){
                librarians[index] = null;
            }
            index++;
        }
        throw new Exception("Can not deleted librarian " + librarian.getId());
    }

    public Librarian[] viewLibrarianList()throws Exception{
        if (librarians == null)
            throw new Exception("There is no such object");

        int count = 0;
        for (Librarian el : librarians) {
            if (el != null){
                count++;
            }
        }

        Librarian[] result = new Librarian[count];
        int index = 0;
        for (Librarian el : librarians) {
            if (el != null){
                result[index] = el;
            }
            index++;
        }
        return result;
    }

    private boolean checkLibrarian(Librarian librarian)throws Exception{
        if (librarian == null)
            throw new Exception("Such an object does not exist" );

        int index = 0;
        for (Librarian librarian1 : librarians) {
            if (librarian1 != null && librarian1.equals(librarian)){
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
        for (Librarian librarian : librarians) {
            if (librarian ==  null){
                countNull++;
            }
            index++;
        }
        return countNull;
    }
}
