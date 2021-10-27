package BankSystem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest
{
    private Account TestAccount = new Account("Test", 200.0, "test@example.com");
    private Account TestAccount2 = new Account("Test2", 200.0, "test2@example.com");
    private double mockAmount1 = 200.0;
    private double mockAmount2 = 400;

    @Test
    void getBalance()
    {
        assertEquals(TestAccount.getBalance(), 200.0);
    }

    @Test
    void getName()
    {
        assertEquals(TestAccount.getName(), "Test");
    }

    @Test
    void getEmailAddress()
    {
        assertEquals(TestAccount.getEmailAddress(), "test@example.com");
    }

    @Test
    void getDetails()
    {
        assertEquals("Name: Test Email address: test@example.com Balance: £200.0", TestAccount.getDetails());
    }
}