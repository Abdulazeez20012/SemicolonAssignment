public class Reservation {
    private Room room;
    private Client client;
    private int numberOfNights;

    public Reservation(Room room, Client client, int numberOfNights) {
        this.room = room;
        this.client = client;
        this.numberOfNights = numberOfNights;
    }

    public Room getRoom() {
        return room;
    }

    public Client getClient() {
        return client;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public double getTotalPayment() {
        return room.getPricePerNight() * numberOfNights;
    }

    @Override
    public String toString() {
        return "Reservation for " + client.getName() + " (" + client.getEmail() + ") - Room " +
                room.getRoomNumber() + " (" + room.getRoomType() + ") for " + numberOfNights +
                " nights. Total payment: ₦" + getTotalPayment();
    }
}
