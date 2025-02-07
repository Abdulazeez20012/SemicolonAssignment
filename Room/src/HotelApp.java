import java.util.Scanner;

public class HotelApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HotelSystem hotelSystem = new HotelSystem();

        while (true) {
            try {
                System.out.println("\nMENU:");
                System.out.println("1. Book Room");
                System.out.println("2. View Available Rooms");
                System.out.println("3. Cancel Booking");
                System.out.println("4. Exit");
                System.out.print("Please choose an option: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:

                        boolean validRoomType = false;
                        String roomType = "";
                        while (!validRoomType) {
                            System.out.print("Enter room type (Single/Double/Suite): ");
                            roomType = scanner.nextLine();
                            if (roomType.equalsIgnoreCase("Single") || roomType.equalsIgnoreCase("Double") || roomType.equalsIgnoreCase("Suite")) {
                                validRoomType = true;
                            } else {
                                System.out.println("Invalid room type. Please enter one of the following: Single, Double, Suite.");
                            }
                        }

                        System.out.print("Enter your name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter your phone number: ");
                        String phone = scanner.nextLine();
                        System.out.print("Enter your email: ");
                        String email = scanner.nextLine();
                        hotelSystem.bookRoom(name, phone, email, roomType);
                        break;
                    case 2:
                        hotelSystem.viewAvailableRooms();
                        break;
                    case 3:
                        // Handle incorrect booking reference
                        boolean validBookingReference = false;
                        String bookingReference = "";
                        while (!validBookingReference) {
                            System.out.print("Enter booking reference to cancel: ");
                            bookingReference = scanner.nextLine();
                            boolean referenceExists = false;
                            for (int i = 0; i < hotelSystem.bookingCount; i++) {
                                if (hotelSystem.guests[i].bookingReference.equals(bookingReference)) {
                                    referenceExists = true;
                                    break;
                                }
                            }
                            if (referenceExists) {
                                validBookingReference = true;
                                hotelSystem.cancelBooking(bookingReference);
                            } else {
                                System.out.println("Invalid booking reference. Please try again.");
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid option. Please choose a valid option.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid number.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
