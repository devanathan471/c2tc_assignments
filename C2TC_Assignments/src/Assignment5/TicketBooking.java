package Assignment5;

public class TicketBooking {
    private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    // Default constructor
    public TicketBooking() {}

    // Parameterized constructor
    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getters and setters
    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Overloaded methods for payment
    public void makePayment(double amount) {
        System.out.println("Amount " + String.format("%.1f", amount) + " paid in cash");
    }

    public void makePayment(double amount, String walletNumber) {
        System.out.println("Amount " + String.format("%.1f", amount) + " paid using wallet number " + walletNumber);
    }

    public void makePayment(String cardHolderName, double amount, String creditCardType, String ccv) {
        System.out.println("Holder name:" + cardHolderName);
        System.out.println("Amount " + String.format("%.1f", amount) + " paid using " + creditCardType + " card");
        System.out.println("CCV:" + ccv);
    }

    // Display method
    public void displayDetails() {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
    }
}
