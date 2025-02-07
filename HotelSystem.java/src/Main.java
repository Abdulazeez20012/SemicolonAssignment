import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        Notification notification = new Notification();

        System.out.println("Welcome to Naija Comfort Inn!");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter your email address: ");
        String email = scanner.nextLine();
        Guest guest = new Guest(name, phone, email);

        System.out.print("Select room type (Single/Double/Suite): ");
        String roomType = scanner.nextLine();
        System.out.print("Enter number of nights: ");
        int nights = scanner.nextInt();

        // Book room
        String bookingDetails = hotel.bookRoom(guest, roomType, nights);
        System.out.println(bookingDetails);

        // Send booking reminder
        System.out.println("Sending reminder...");
        notification.sendBookingReminder(guest.getName(), "RES1234", "101");

        scanner.close();
    }
}
