/**
 * Booking class for comic booking system
 * @author RogueATU
 */
public class Booking {

    //private Date bookingDate;
    /**
     * The customer making the booking
     */
    private Customer customer;
    /**
     * The workshop that is being booked
     */
    private String workshop;
    /**
     * The number of tickets being purchased
     */
    private int tickets;

    public Booking(Customer customer, Workshop workshop, int tickets){

    }

    /**
     * Getter for Customer
     *
     * @return customer
     */
    public Customer getCustomer(){
        return customer;
    }

    /**
     * Getter for Workshop
     *
     * @return workshop
     */
    public String getWorkshop(){
        return workshop;
    }

    /**
     * Getter for tickets
     *
     * @return tickets
     */
    public int getTickets(){
        return tickets;
    }
    /**
     * To string method for Booking
     * @return the customer, workshop and amount of tickets
     */


    public void setTickets(int tickets){
        this.tickets = tickets;
    }

    public void setCustomer(String username){
        this.username = username;
    }

    public void setWorkshop(String workshop){
        this.workshop = workshop;
    }
    @Override
    public String toString(){
        return this.getCustomer() + " booked " + tickets+ " for " + workshop;
    }

}
