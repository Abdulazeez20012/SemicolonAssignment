import java.util.Scanner;

class Room {
    String roomNumber;
    String roomType;
    double pricePerNight;
    boolean isAvailable;

    public Room(String roomNumber, String roomType, double pricePerNight) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.isAvailable = true;
    }

    public void bookRoom() {
        this.isAvailable = false;
    }

    public void cancelBooking() {
        this.isAvailable = true;
    }
}

class Guest {
    String name;
    String phoneNumber;
    String email;
    String bookingReference;

    public Guest(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}

class HotelSystem {
    Room[] rooms = new Room[5];
    Guest[] guests = new Guest[5];
    int bookingCount = 0;

    public HotelSystem() {
        rooms[0] = new Room("101", "Single", 10000);
        rooms[1] = new Room("102", "Single", 10000);
        rooms[2] = new Room("203", "Double", 15000);
        rooms[3] = new Room("301", "Suite", 25000);
        rooms[4] = new Room("302", "Suite", 25000);
    }

    public void bookRoom(String name, String phone, String email, String roomType) {
        try {
            boolean roomFound = false;
            for (Room room : rooms) {
                if (room.isAvailable && room.roomType.equals(roomType)) {
                    Guest guest = new Guest(name, phone, email);
                    guest.bookingReference = "RES" + (bookingCount + 1);
                    guests[bookingCount] = guest;
                    room.bookRoom();
                    bookingCount++;

                    System.out.println("Booking Successful!");
                    System.out.println("Guest Details:");
                    guest.getDetails();
                    System.out.println("Room Number: " + room.roomNumber);
                    System.out.println("Room Type: " + room.roomType);
                    System.out.println("Price per Night: ₦" + room.pricePerNight);
                    System.out.println("Booking Reference Number: " + guest.bookingReference);
                    roomFound = true;
                    return;
                }
            }

            if (!roomFound) {
                throw new Exception("No available rooms of type " + roomType);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void cancelBooking(String bookingReference) {
        try {
            boolean bookingFound = false;
            for (int i = 0; i < bookingCount; i++) {
                if (guests[i].bookingReference.equals(bookingReference)) {
                    bookingFound = true;
                    // Find the room associated with this booking and cancel it
                    for (Room room : rooms) {
                        if (room.roomNumber.equals(guests[i].bookingReference)) {
                            room.cancelBooking();
                            System.out.println("Booking " + bookingReference + " has been canceled.");
                            return;
                        }
                    }
                }
            }

            if (!bookingFound) {
                throw new Exception("No booking found with reference " + bookingReference);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void viewAvailableRooms() {
        try {
            boolean found = false;
            System.out.println("Available Rooms:");
            for (Room room : rooms) {
                if (room.isAvailable) {
                    found = true;
                    System.out.println("Room Number: " + room.roomNumber + " | Type: " + room.roomType + " | Price: ₦" + room.pricePerNight);
                }
            }
            if (!found) {
                throw new Exception("No rooms available at the moment.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

public class Main {
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
                        // Handle incorrect inputs for room type and other details
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
