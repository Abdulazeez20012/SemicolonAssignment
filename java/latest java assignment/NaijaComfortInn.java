import java.util.Scanner;

public class NaijaComfortInn {

    static String guestName = "";
    static String guestPhone = "";
    static String guestEmail = "";
    static int guestRoomNumber = 0;
    static boolean isRoomBooked = false;
    static final int singleRoomPrice = 10000;
    static final int doubleRoomPrice = 15000;
    static final int suiteRoomPrice = 25000;

    		public static void main(String[] args) {
       			 Scanner scanner = new Scanner(System.in);

        		while (true) {
            			System.out.println("Welcome to Naija Comfort Inn!");
            			System.out.println("1. Book Room");
            			System.out.println("2. View Booking");
            			System.out.println("3. Edit Profile");
           			 System.out.println("4. View Available Rooms");
            			System.out.println("5. Cancel Booking");
            			System.out.println("6. Calculate Payment");
            			System.out.println("7. Exit");
            			System.out.print("Select an option (1-7): ");
            			int choice = scanner.nextInt();
            			scanner.nextLine(); 

           			 if (choice == 1) {
                			bookRoom(scanner);
            			} else if (choice == 2) {
              				  viewBooking();
           			 } else if (choice == 3) {
              				  editProfile(scanner);
          			  } else if (choice == 4) {
              				  viewAvailableRooms();
           			 } else if (choice == 5) {
               				 cancelBooking();
           			 } else if (choice == 6) {
              				  calculatePayment(scanner);
           			 } else if (choice == 7) {
              				  System.out.println("Thank you for using Naija Comfort Inn!");
              				  break;
          			  } else {
               				 System.out.println("Invalid choice, please try again.");
           		 }
      		  }
   	 }

    
    		public static void bookRoom(Scanner scanner) {
       		 if (isRoomBooked) {
            		System.out.println("Sorry, a room is already booked.");
            		return;
        }

        System.out.print("Enter your name: ");
        guestName = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        guestPhone = scanner.nextLine();
        System.out.print("Enter your email: ");
        guestEmail = scanner.nextLine();

       		 System.out.print("Select room type (1 for Single, 2 for Double, 3 for Suite): ");
        	int roomType = scanner.nextInt();
       		 scanner.nextLine(); 

      		  if (roomType == 1) {
           		 guestRoomNumber = 101; 
       		 } else if (roomType == 2) {
           		 guestRoomNumber = 201; 
       		 } else if (roomType == 3) {
          		  guestRoomNumber = 301; 
       		 } else {
          		  System.out.println("Invalid room type.");
          		  return;
      		  }

      		  isRoomBooked = true;
       			 System.out.println("Room booked successfully! Room number: " + guestRoomNumber);
    }

    
    public static void viewBooking() {
        if (isRoomBooked) {
            System.out.println("Booking Details:");
            System.out.println("Name: " + guestName);
            System.out.println("Phone: " + guestPhone);
            System.out.println("Email: " + guestEmail);
            System.out.println("Room Number: " + guestRoomNumber);
        } else {
            System.out.println("No room is booked.");
        }
    }

   
   		 public static void editProfile(Scanner scanner) {
      		  if (!isRoomBooked) {
          		 System.out.println("No booking found.");
           		 return;
       		 }

        		System.out.print("Enter your new phone number: ");
       			 guestPhone = scanner.nextLine();
       			System.out.print("Enter your new email: ");
        		guestEmail = scanner.nextLine();

       				 System.out.println("Profile updated successfully.");
   				 }

    
    public static void viewAvailableRooms() {
        if (isRoomBooked) {
            System.out.println("No rooms are available.");
        } else {
            System.out.println("Available Rooms:");
            System.out.println("Room 101: Single Room");
            System.out.println("Room 201: Double Room");
            System.out.println("Room 301: Suite");
        }
    }

    
    public static void cancelBooking() {
        if (isRoomBooked) {
            System.out.println("Booking canceled.");
            isRoomBooked = false;
        } else {
            System.out.println("No booking to cancel.");
        }
    }

    
  		  public static void calculatePayment(Scanner scanner) {
       			 if (!isRoomBooked) {
           			 System.out.println("No room is booked.");
            			 return;
       			 }

        			System.out.print("Enter number of nights: ");
        			int nights = scanner.nextInt();
        			scanner.nextLine(); 

        int roomPrice = 0;
        if (guestRoomNumber == 101) {
            roomPrice = singleRoomPrice;
        } else if (guestRoomNumber == 201) {
            roomPrice = doubleRoomPrice;
        } else if (guestRoomNumber == 301) {
            roomPrice = suiteRoomPrice;
        }

        System.out.print("Is this a festive period? (Yes/No): ");
        String festive = scanner.nextLine();
        if (festive.equalsIgnoreCase("Yes")) {
            roomPrice += roomPrice / 5; 
        }

        System.out.println("Total Payment: ₦" + (roomPrice * nights));
    }
}
