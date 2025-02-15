package SF3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    @Test
    public void TestThatAccountExist(){
        String pin = "2443";
        String name = "abiodun";
        Account account = new Account(pin, name);
        assertTrue(account.itExist());
    }
    @Test
    public void testThat_Account_DoesNot_Exist() {
        String pin = "2443";
        String name = "abiodun";
        Account account = new Account(pin, name);
        assertFalse(account.notExist());
    }

    @Test
    public void testThatCan_Deposit_To_Account_Depositing_200_And_Balance_Should_Be_200() {
        String pin = "2443";
        String name = "abiodun";
        Account account = new Account(pin, name);

        assertEquals(0, account.getBalance());
        account.deposit(200);
        assertEquals(200, account.getBalance());
    }
    @Test
    public void test_For_Negative_Deposit_Eg_Minus_Balance() {
        String pin = "2443";
        String name = "abiodun";
        Account account = new Account(pin, name);

        Exception exception = null;
        try {
            account.deposit(-100);
        } catch (IllegalArgumentException e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception.getMessage().contains("Deposit amount must be greater than 0"));
    }

    @Test
    public void test_To_Withdraw_from_Account() {
        String pin = "2443";
        String name = "abiodun";
        Account account = new Account(pin, name);

        assertEquals(0, account.getBalance());
        account.deposit(200);
        assertEquals(200, account.getBalance());

        account.withdraw(100, pin);
        assertEquals(100, account.getBalance());
    }
   /* @Test
    public void test_To_Withdraw_With_A_WrongPin() {
        String pin = "2443";
        String name = "abiodun";
        Account account = new Account(pin, name);

        account.deposit(200);
        account.withdraw(100,"2443");
        Exception exception = null;
        try {
            account.withdraw(100, "2443");
        } catch (IllegalStateException e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception.getMessage().contains("Wrong PIN"));
    }*/

    @Test
    public void test_Withdraw_More_Than_Balance_Available_In_Account() {
        String pin = "2443";
        String name = "abiodun";
        Account account = new Account(pin, name);

        account.deposit(100);

        Exception exception = null;
        try {
            account.withdraw(200, pin);
        } catch (IllegalArgumentException e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception.getMessage().contains("Insufficient balance"));
    }
    @Test
    public void test_To_Withdraw_Amount_Lesser_Than_Zero() {
        String pin = "2443";
        String name = "abiodun";
        Account account = new Account(pin, name);

        account.deposit(100);

        Exception exception = null;
        try {
            account.withdraw(-0, pin);
        } catch (IllegalArgumentException e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception.getMessage().contains("Withdrawal amount must be greater than 0"));
    }

    @Test
    public void testTo_Withdraw_Zero_Amount() {
        String pin = "2443";
        String name = "abiodun";
        Account account = new Account(pin, name);

        account.deposit(100);

        Exception exception = null;
        try {
            account.withdraw(0, pin);
        } catch (IllegalArgumentException e) {
            exception = e;
        }
        assertNotNull(exception);
        assertTrue(exception.getMessage().contains("Withdrawal amount must be greater than 0"));
    }
    @Test
    public void test_To_Check_Balance_In_Account() {
        String pin = "2443";
        String name = "abiodun";
        Account account = new Account(pin, name);

        assertEquals(0, account.getBalance());
        account.deposit(200);
        assertEquals(200, account.getBalance());

        assertEquals(200, account.checkBalance(pin));
    }

    @Test
    public void testTO_Update_Pin_For_Account() {
        String pin = "2443";
        String name = "abiodun";
        Account account = new Account(pin, name);

        account.updatePin("2443", "1234");

        account.deposit(200);
        account.withdraw(100, "2443");

        assertEquals(100, account.getBalance());
    }

    @Test
    public void testTO_Update_Pin_To_Same_Pin() {
        String pin = "2443";
        String name = "abiodun";
        Account account = new Account(pin, name);

        account.updatePin("2443", "1234");

        account.deposit(200);
        account.withdraw(100, "2443");

        assertEquals(100, account.getBalance());
    }
    @Test
    public void testUpdatePinWithIncorrectCurrentPin() {
        String pin = "1234";
        String name = "abiodun";
        Account account = new Account(pin, name);

        Exception exception = null;

        try {
            account.updatePin("0000", "5678");
        } catch (SecurityException exception1) {
            exception = exception1;
        }

        assertNotNull(exception);
        assertTrue(exception.getMessage().contains("Current PIN is incorrect"));

        account.deposit(200);
        account.withdraw(100, pin);

        assertEquals(100, account.getBalance(), "Old PIN should still work after failed update");
    }
}



