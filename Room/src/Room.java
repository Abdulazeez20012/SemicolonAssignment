public class Room {
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

