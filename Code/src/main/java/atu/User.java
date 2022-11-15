package main.java.atu;

/**
 * User class for comic booking system
 * @author RogueATU
 */
public class User {
    /**
     *The name of the user they will access the system with
     */
    private String username;

    /**
     * Constructor for User
     * @param username the username of the User
     */
    public User(String username){
        setUsername(username);
    }

    /**
     * Getter for username
     * @return username
     */
    public String getUsername(){
        return username;
    }

    /**
     * Setter for username
     * @param username the username of the User
     */
    public void setUsername(String username){
        this.username=username;
    }

    /**
     * To string method for User
     * @return username
     */
    @Override
    public String toString(){
        return username;
    }
}
