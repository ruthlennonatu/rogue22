package main.java.atu;
/**
 * Booking class for comic booking system
 * @author RogueATU
 */
public class Booking {

    //private Date bookingDate;
    private Customer customer;
    private Workshop workshop;
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
