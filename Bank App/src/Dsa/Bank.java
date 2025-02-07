package Dsa;

import java.util.HashMap;
import java.util.Map;

public class Bank {
    private final Map<String, Account> accounts = new HashMap<>();

    public void createAccount(String pin, String name) {
        if (accounts.containsKey(name)) {
            throw new IllegalArgumentException("Account with this name already exists");
        }
        accounts.put(name, new Account(pin, name));
    }

    public void deposit(int amount, String name) {
        Account account = accounts.get(name);
        if (account == null) {
            throw new IllegalArgumentException("Account not found");
        }
        account.deposit(amount);
    }

    public int checkBalance(String pin, String name) {
        Account account = accounts.get(name);
        if (account == null || !account.verifyPin(pin)) {
            throw new IllegalArgumentException("Invalid account or PIN");
        }
        return account.getBalance();
    }

    public void withdraw(String pin, String name, int amount) { // Updated method signature
        Account account = accounts.get(name);
        if (account == null || !account.verifyPin(pin)) {
            throw new IllegalArgumentException("Invalid account or PIN");
        }
        account.withdraw(amount, pin); // Call with both amount and pin
    }

    public void transfer(String senderPin, String senderName, String receiverName, int amount) {
        Account senderAccount = accounts.get(senderName);
        Account receiverAccount = accounts.get(receiverName);
        if (senderAccount == null || receiverAccount == null || !senderAccount.verifyPin(senderPin)) {
            throw new IllegalArgumentException("Invalid account or PIN");
        }
        senderAccount.withdraw(amount, senderPin);
        receiverAccount.deposit(amount);
    }

    public void closeAccount(String name, String pin) {
        Account account = accounts.get(name);
        if (account == null || !account.verifyPin(pin)) {
            throw new IllegalArgumentException("Invalid account or PIN");
        }
        accounts.remove(name);
    }
}
