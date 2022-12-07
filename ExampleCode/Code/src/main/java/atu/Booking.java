package main.java.atu;
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
    private Workshop workshop;
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
    
    public void setCustomer(String Customer){
        this.customer=customer;
    }

    /**
     * Getter for Workshop
     *
     * @return workshop
     */
    public Workshop getWorkshop(){
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

}
