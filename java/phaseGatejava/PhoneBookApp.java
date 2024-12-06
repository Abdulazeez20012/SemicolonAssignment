import java.util.Scanner;

public class PhoneBookApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        String firstName = "";
        String lastName = "";
        int phoneNumber = 0;

       
        System.out.println("Phone Book App");
        System.out.println("1. Add contact");
        System.out.println("2. Find contact by phone number");
	System.out.println("3. Remove contact");
        System.out.println("3. Exit");

      	boolean isAddingToContact = true;
       	     while (isAddingToContact) {

             	 System.out.print("Choose an option (1-4): ");
           	 int choice = scanner.nextInt();
             	scanner.nextLine();

         	   if (choice == 1) {
                
               			 System.out.println("Enter first name: ");
               			 firstName = scanner.nextLine();
	
               			 System.out.println("Enter last name: ");
                		 lastName = scanner.nextLine();

                		 System.out.println("Enter phone number: ");
               			 phoneNumber = scanner.nextInt();
				scanner.nextLine();

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
              
            				    System.out.println("THANK YOU");
					    isAddingToContact = false;
						continue;
        				    } else {
          	    
          				      System.out.println("Invalid option, try again.");
            }
        }

        
    }
}
