import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hotel hotel = new Hotel();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        Client client = new Client(name, email);

        client.bookRoom(hotel, scanner);

        System.out.println("\nAll Bookings:");
        hotel.viewAllBookings();

        scanner.close();
    }
}
