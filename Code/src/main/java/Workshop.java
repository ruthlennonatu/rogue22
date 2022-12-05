/**
 * Workshop class for comic booking system
 * @author RogueATU
 */
public class Workshop {
    /**
     * The name of the workshop
     */
    private String name;
    /**
     * The number of possible attendees
     */
    private int attendees;
    /**
     * The date the workshop takes place
     */
    private String date;
    //private Date date;


    /**
     * Constructor for User
     *
     * @param name      the name of the workshop
     * @param attendees the amount of possible places
     */
    public Workshop(String name, int attendees) {
        setName(name);
        setAttendees(attendees);

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

    /**
     * Getter for Date
     *
     * @return Date
     */
    public String getDate() {
        return date;
    }

    /**
     * Setter for name
     * @param name the name of the workshop
     */
    public void setName(String name){
        this.name=name;
    }

    /**
     * Setter for attendees
     * @param attendees the number of possible places for the workshop
     */
    public void setAttendees(int attendees){
        this.attendees=attendees;
    }

    /**
     * Setter for date
     * @param date the number of possible places for the workshop
     */
    public void setDate(String date){
        this.date=date;
    }

    /**
     * To string method for Workshop
     * @return the name and the attendees of the workshop
     */
    @Override
    public String toString(){
        return name + " "+ attendees;
    }
}