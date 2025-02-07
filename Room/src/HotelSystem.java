public class HotelSystem {

    public Guest[] guests;
    public int bookingCount;

   public HotelSystem() {
        Room[] rooms = new Room[5];
        Guest[] guests = new Guest[5];
        int bookingCount = 0;

        public  new HotelSystem(); {
            rooms[0] = new Room("101", "Single", 10000);
            rooms[1] = new Room("102", "Single", 10000);
            rooms[2] = new Room("203", "Double", 15000);
            rooms[3] = new Room("301", "Suite", 25000);
            rooms[4] = new Room("302", "Suite", 25000);
        }

    }
    public void bookRoom(String name, String phone, String email, String roomType) {
        try {
            boolean roomFound = false;
            Room[] rooms;
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
            Room[] rooms;
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

