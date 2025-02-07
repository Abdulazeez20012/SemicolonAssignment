public class Guest {
    private String name;
    private String phoneNumber;
    private String email;


    public Guest(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Guest [Name=" + name + ", Phone=" + phoneNumber + ", Email=" + email + "]";
    }
}
