package Assignment4;
public class KingFisher implements Airfare {
    private int hours;
    private double costPerHour;

    // Default constructor
    public KingFisher() {
    }

    // Parameterized constructor
    public KingFisher(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    // Getters and Setters
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    // Method to calculate amount
    public double calculateAmount() {
        return hours * costPerHour * 4;
    }

    // Display method
    public void display() {
        System.out.println("KingFisher Fare: ₹" + String.format("%.2f", calculateAmount()));
    }
}