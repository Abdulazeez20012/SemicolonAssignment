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
                return;
            }
        }
        System.out.println("Sorry, no available rooms of type " + roomType);
    }

    public void cancelBooking(String bookingReference) {
        for (int i = 0; i < bookingCount; i++) {
            if (guests[i].bookingReference.equals(bookingReference)) {
                for (Room room : rooms) {
                    if (room.roomNumber.equals(guests[i].bookingReference)) {
                        room.cancelBooking();
                        System.out.println("Booking " + bookingReference + " has been canceled.");
                        return;
                    }
                }
            }
        }
        System.out.println("No booking found with reference " + bookingReference);
    }

    public void viewAvailableRooms() {
        System.out.println("Available Rooms:");
        for (Room room : rooms) {
            if (room.isAvailable) {
                System.out.println("Room Number: " + room.roomNumber + " | Type: " + room.roomType + " | Price: ₦" + room.pricePerNight);
            }
        }
    }
}

public class HotelApp {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        HotelSystem hotelSystem = new HotelSystem();

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Book Room");
            System.out.println("2. View Available Rooms");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Please choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your phone number: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter your email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter room type (Single/Double/Suite): ");
                    String roomType = scanner.nextLine();
                    hotelSystem.bookRoom(name, phone, email, roomType);
                    break;
                case 2:
                    hotelSystem.viewAvailableRooms();
                    break;
                case 3:
                    System.out.print("Enter booking reference to cancel: ");
                    String bookingReference = scanner.nextLine();
                    hotelSystem.cancelBooking(bookingReference);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}