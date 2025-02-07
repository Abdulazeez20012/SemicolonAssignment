import java.util.ArrayList;

public class Hotel {
    private final ArrayList<Room> rooms;
    private final ArrayList<Reservation> reservations;


    public Hotel() {
        rooms = new ArrayList<>();
        reservations = new ArrayList<>();

        rooms.add(new Room(101, "Single", 10000));
        rooms.add(new Room(102, "Single", 10000));
        rooms.add(new Room(203, "Double", 15000));
        rooms.add(new Room(301, "Suite", 25000));
    }

    public String bookRoom(Client client, String roomType, int numberOfNights) {
        for (Room room : rooms) {
            if (room.getRoomType().equalsIgnoreCase(roomType) && room.isAvailable()) {
                room.setAvailable(false);

                Reservation reservation = new Reservation(room, client, numberOfNights);
                reservations.add(reservation);

                return "Booking successful! " + reservation;
            }
        }

        return "No available rooms of type " + roomType;
    }

    public void viewAllBookings() {
        if (reservations.isEmpty()) {
            System.out.println("No bookings yet.");
        } else {
            System.out.println("All Bookings:");
            for (Reservation reservation : reservations) {
                System.out.println(reservation);
            }
        }
    }

    public void markRoomUnavailable(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                room.setAvailable(false);
                System.out.println("Room " + roomNumber + " is now unavailable.");
                return;
            }
        }
        System.out.println("Room " + roomNumber + " not found.");
    }

    public void markRoomAvailable(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                room.setAvailable(true);
                System.out.println("Room " + roomNumber + " is now available.");
                return;
            }
        }
        System.out.println("Room " + roomNumber + " not found.");



    }

}