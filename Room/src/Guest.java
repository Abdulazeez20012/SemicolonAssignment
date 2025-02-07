public class Guest {
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
