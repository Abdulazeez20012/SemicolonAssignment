import java.util.Scanner;

class NaijaComfortInn {

    static String[] rooms = {"101", "102", "103", "104", "105"};
    static String[] roomTypes = {"Single", "Double", "Suite"};
    static boolean[] roomAvailability = {true, true, true, true, true};
    static double[] roomPrices = {10000, 15000, 25000};
    static String[] guestNames = new String[5];
    static String[] guestPhones = new String[5];
    static String[] guestEmails = new String[5];
    static String[] bookingReferences = new String[5];
    static int[] nightsStayed = new int[5];
    static boolean[] isFestive = new boolean[5];
    static double[] totalPayments = new double[5];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to Naija Comfort Inn!");
            System.out.println("1. Book Room");
            System.out.println("2. View Booking");
            System.out.println("3. Edit Profile");
            System.out.println("4. Check Room Availability");
            System.out.println("5. Payment Status");
            System.out.println("6. Cancel Booking");
            System.out.println("7. View All Available Rooms");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    bookRoom(sc);
                    break;
                case 2:
                    viewBooking(sc);
                    break;
                case 3:
                    editProfile(sc);
                    break;
                case 4:
                    checkRoomAvailability();
                    break;
                case 5:
                    checkPaymentStatus(sc);
                    break;
                case 6:
                    cancelBooking(sc);
                    break;
                case 7:
                    viewAvailableRooms();
                    break;
                case 8:
                    System.out.println("Thank you for using Naija Comfort Inn!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
            }
        }
    }


    public static void bookRoom(Scanner sc) {
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your phone number: ");
        String phone = sc.nextLine();
        System.out.print("Enter your email address: ");
        String email = sc.nextLine();
        System.out.print("Select room type (Single/Double/Suite): ");
        String roomType = sc.nextLine();
        System.out.print("Enter number of nights: ");
        int nights = sc.nextInt();
        sc.nextLine();
        System.out.print("Is this a festive period? (Yes/No): ");
        String festiveInput = sc.nextLine();
        boolean isFestivePeriod = festiveInput.equalsIgnoreCase("Yes");


        int roomIndex = findAvailableRoom(roomType);
        if (roomIndex != -1) {
            System.out.println("Room " + rooms[roomIndex] + " is available.");
            System.out.print("Enter booking reference number: ");
            String bookingReference = "RES" + (1000 + roomIndex);  // Simple booking reference number

            guestNames[roomIndex] = name;
            guestPhones[roomIndex] = phone;
            guestEmails[roomIndex] = email;
            bookingReferences[roomIndex] = bookingReference;
            nightsStayed[roomIndex] = nights;
            isFestive[roomIndex] = isFestivePeriod;

            double payment = calculatePayment(roomIndex, nights, isFestivePeriod);
            totalPayments[roomIndex] = payment;

            roomAvailability[roomIndex] = false;

            System.out.println("Booking Successful!");
            System.out.println("Guest Details:");
            System.out.println("Name: " + name);
            System.out.println("Phone: " + phone);
            System.out.println("Email: " + email);
            System.out.println("Room Details:");
            System.out.println("Room Number: " + rooms[roomIndex]);
            System.out.println("Type: " + roomType);
            System.out.println("Price per Night: ₦" + roomPrices[roomIndex]);
            System.out.println("Total Payment: ₦" + payment);
            System.out.println("Booking Reference Number: " + bookingReference);
            System.out.println("Your check-in date is 10th January, and check-out date is 13th January.");
        } else {
            System.out.println("Sorry, no available rooms for the selected type.");
        }
    }

    public static void viewBooking(Scanner sc) {
        System.out.print("Enter your booking reference number: ");
        String reference = sc.nextLine();

        for (int i = 0; i < bookingReferences.length; i++) {
            if (bookingReferences[i] != null && bookingReferences[i].equals(reference)) {
                System.out.println("Guest Details:");
                System.out.println("Name: " + guestNames[i]);
                System.out.println("Phone: " + guestPhones[i]);
                System.out.println("Email: " + guestEmails[i]);
                System.out.println("Room Number: " + rooms[i]);
                System.out.println("Room Type: " + roomTypes[i]);
                System.out.println("Nights: " + nightsStayed[i]);
                System.out.println("Total Payment: ₦" + totalPayments[i]);
                return;
            }
        }
        System.out.println("No booking found for that reference.");
    }

    public static void editProfile(Scanner sc) {
        System.out.print("Enter your booking reference number: ");
        String reference = sc.nextLine();

        for (int i = 0; i < bookingReferences.length; i++) {
            if (bookingReferences[i] != null && bookingReferences[i].equals(reference)) {
                System.out.print("Enter new phone number: ");
                guestPhones[i] = sc.nextLine();
                System.out.print("Enter new email address: ");
                guestEmails[i] = sc.nextLine();
                System.out.println("Profile updated successfully.");
                return;
            }
        }
        System.out.println("No booking found for that reference.");
    }


    public static void checkRoomAvailability() {
        for (int i = 0; i < rooms.length; i++) {
            if (roomAvailability[i]) {
                System.out.println("Room " + rooms[i] + " is available.");
            } else {
                System.out.println("Room " + rooms[i] + " is occupied.");
            }
        }
    }


    public static void checkPaymentStatus(Scanner sc) {
        System.out.print("Enter your booking reference number: ");
        String reference = sc.nextLine();

        for (int i = 0; i < bookingReferences.length; i++) {
            if (bookingReferences[i] != null && bookingReferences[i].equals(reference)) {
                System.out.println("Total Payment: ₦" + totalPayments[i]);
                return;
            }
        }
        System.out.println("No booking found for that reference.");
    }


    public static void cancelBooking(Scanner sc) {
        System.out.print("Enter your booking reference number: ");
        String reference = sc.nextLine();

        for (int i = 0; i < bookingReferences.length; i++) {
            if (bookingReferences[i] != null && bookingReferences[i].equals(reference)) {
                System.out.println("Reservation canceled successfully.");
                System.out.println("Room " + rooms[i] + " is now available.");
                roomAvailability[i] = true;
                guestNames[i] = null;
                guestPhones[i] = null;
                guestEmails[i] = null;
                bookingReferences[i] = null;
                totalPayments[i] = 0;
                return;
            }
        }
        System.out.println("No booking found for that reference.");
    }


    public static void viewAvailableRooms() {
        System.out.println("Available Rooms:");
        for (int i = 0; i < rooms.length; i++) {
            if (roomAvailability[i]) {
                }
                System.out.println("Room Number: " + rooms[i] + " | Type: " + roomTypes[i] + " | Price: ₦" + roomPrices[i]);
            }
        }
    }


    public static int findAvailableRoom(String roomType) {
        for (int i = 0; i < rooms.length; i++) {
            if (roomAvailability[i] && roomTypes[i].equalsIgnoreCase(roomType)) {
                return i;
            }
        }
        return -1;
    }


    public static double calculatePayment(int roomIndex, int nights, boolean isFestive) {
        double basePrice = roomPrices[roomIndex] * nights;
        if (isFestive) {
            return basePrice * 1.2;
        }
        return basePrice;
    }
}
