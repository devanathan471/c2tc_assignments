package Assignment5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bookingInput = sc.nextLine().split(",");
        TicketBooking booking = new TicketBooking(
                bookingInput[0].trim(),
                bookingInput[1].trim(),
                Integer.parseInt(bookingInput[2].trim())
        );

        int choice = Integer.parseInt(sc.nextLine().trim());

        switch (choice) {
            case 1:
                double amount1 = Double.parseDouble(sc.nextLine().trim());
                booking.displayDetails();
                booking.makePayment(amount1);
                break;

            case 2:
                double amount2 = Double.parseDouble(sc.nextLine().trim());
                String wallet = sc.nextLine().trim();
                booking.displayDetails();
                booking.makePayment(amount2, wallet);
                break;

            case 3:
                String name = sc.nextLine().trim();
                double amount3 = Double.parseDouble(sc.nextLine().trim());
                String cardType = sc.nextLine().trim();
                String ccv = sc.nextLine().trim();
                booking.displayDetails();
                booking.makePayment(name, amount3, cardType, ccv);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}