package Assignment2;

public class Main {

	public static void main(String[] args) {
	        student s = new student();

	        // Create Commission object using constructor
	        Commision emp = new Commision("Prat", "Pondy", "9876543210", 60000);

	        System.out.println("Name: " + emp.getName());
	        System.out.println("Address: " + emp.getAddress());
	        System.out.println("Phone: " + emp.getPhone());
	        System.out.println("Sales Amount: ₹" + emp.getSalesAmount());

	        emp.setSalesAmount(85000);
	        System.out.println("Updated Sales Amount: ₹" + emp.getSalesAmount());
	}

}
