package ie.atu.rogue;

public class UserName {

    private String fName;
    private String mName;
    private String lName;

    public UserName(String firstName, String middleName, String lastName) {
        this.fName = firstName;
        this.mName = middleName;
        this.lName = middleName;
    }

    public int getFullNameLength() {
        return fName.length() + mName.length() + lName.length();
    }

    public String getMiddleInitial() {
        return mName.charAt(0) + ".";
    }

    @Override
    public String toString() {
        return fName + " " + getMiddleInitial() + " " + lName;
    }

}
