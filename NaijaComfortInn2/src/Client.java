import java.util.Scanner;

public class Client {
    private String name;
    private String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }


    public void bookRoom(Hotel hotel, Scanner scanner) {
        System.out.println("\nWelcome " + name + ", let's book your room!");

        System.out.print("Enter the room type you want to book (Single/Double/Suite): ");
        String roomType = scanner.nextLine();

        System.out.print("Enter the number of nights you'd like to stay: ");
        int numberOfNights = scanner.nextInt();
        scanner.nextLine();


        String bookingDetails = hotel.bookRoom(this, roomType, numberOfNights);
        System.out.println(bookingDetails);
    }
}
