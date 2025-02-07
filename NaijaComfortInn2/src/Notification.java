public class Notification {
    public void sendBookingReminder(String guestName, String bookingReference, String roomNumber) {
        System.out.println("Notification sent to " + guestName + ":");
        System.out.println("Dear " + guestName + ", this is a reminder for your stay at Naija Comfort Inn.");
        System.out.println("Booking Reference: " + bookingReference);
        System.out.println("Room Number: " + roomNumber);
    }
}
