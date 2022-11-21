package main.java.atu;

/**
 * Workshop class for comic booking system
 * @author RogueATU
 */
public class Workshop {
    /**
     * The name of the user they will access the system with
     */
    private String name;
    /**
     * The number of possible attendees
     */
    private int attendees;


    /**
     * Constructor for User
     *
     * @param name      the name of the workshop
     * @param attendees the amount of possible places
     */
    public Workshop(String name, int attendees) {
        //setName(name);
        //setAttendees(attendees);

    }

    /**
     * Getter for Name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for Attendees
     *
     * @return Attendees
     */
    public int getAttendees() {
        return attendees;
    }
}

