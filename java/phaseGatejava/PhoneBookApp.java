import java.util.Scanner;

public class PhoneBookApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        String firstName = "";
        String lastName = "";
        String phoneNumber = "";

       
        System.out.println("Simple Phone Book");
        System.out.println("1. Add contact");
        System.out.println("2. Find contact by phone number");
        System.out.println("3. Exit");

      	boolean isAddingToContact = true;
        while (isAddingToContact) {
            System.out.print("Choose an option (1-3): ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                
                System.out.print("Enter first name: ");
                firstName = scanner.nextLine();
                System.out.print("Enter last name: ");
                lastName = scanner.nextLine();
                System.out.print("Enter phone number: ");
                phoneNumber = scanner.nextLine();
                System.out.println("Contact added!");
            } else if (choice == 2) {
                
                System.out.print("Enter phone number to search: ");
                String searchNumber = scanner.nextLine();

                if (searchNumber.equals(phoneNumber)) {
                   
                    System.out.println("Found contact: " + firstName + " " + lastName + " - " + phoneNumber);
                } else {
                   
                    System.out.println("No contact found with that phone number.");
                }
            } else if (choice == 3) {
              
                System.out.println("Goodbye!");
		isAddingToContact = false;
		continue;
            } else {
              
                System.out.println("Invalid option, try again.");
            }
        }

        
    }
}
