package SF3;

public class Account {
    private final String pin;
    private final String name;
    private int balance = 0;

    public Account(String pin, String name) {
        this.pin = pin;
        this.name = name;
    }

    public boolean itExist() {
        return true;
    }

    public boolean notExist() {
        return false;
    }

    public void deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than 0");
        }
        balance += amount;
    }

    public void withdraw(int amount, String pin) {
        if (!verifyPin(pin)) {
            throw new IllegalStateException("Wrong PIN");
        }
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be greater than 0");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }

    public boolean verifyPin(String inputPin) {
        return this.pin.equals(inputPin);
    }

    public void updatePin(String currentPin, String newPin) {
        if (!verifyPin(currentPin)) {
            throw new SecurityException("Current PIN is incorrect");
        }
        if (newPin.equals(currentPin)) {
            throw new IllegalArgumentException("New PIN must be different from the current PIN");
        }

    }

    public int checkBalance(String pin) {
        if (!verifyPin(pin)) {
            throw new IllegalArgumentException("Invalid PIN");
        }
        return balance;
    }
}