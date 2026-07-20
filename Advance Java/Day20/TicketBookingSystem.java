import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TicketBookingSystem {
    public static void main(String[] args) {
        Queue<String> customerQueue = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n--- Ticket Booking System ---");
            System.out.println("1. Add Customer");
            System.out.println("2. Serve Customer");
            System.out.println("3. View Next Customer");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    customerQueue.offer(name);
                    System.out.println(name + " added to the queue.");
                    break;

                case 2:
                    if (customerQueue.isEmpty()) {
                        System.out.println("No customers in the queue to serve.");
                    } else {
                        String served = customerQueue.poll();
                        System.out.println("Served customer: " + served);
                    }
                    break;

                case 3:
                    if (customerQueue.isEmpty()) {
                        System.out.println("The queue is currently empty.");
                    } else {
                        System.out.println("Next customer in line: " + customerQueue.peek());
                    }
                    break;

                case 4:
                    System.out.println("Exiting system. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
