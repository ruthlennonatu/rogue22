// this class is designed to be used as framework for the items present in our database solution
// our database SHOULD consist of Users that correlate to the information present within this class
public class SignUp extends User {
    public String userName;
    public String passWord;
    // this is a test variable to develop relationships between classes
    private final int userID;

    public SignUp(String userName, String passWord) {
        this.userName = userName;
        this.passWord = passWord;
        // theoretically a variable should exist in User that increments as User classes & subclasses get instantiated
        this.userID = nextID;
    }
}