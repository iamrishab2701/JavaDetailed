package Challenge.ClassChallenge;

/*
 * Create a new class for a bank account.
 *
 * Create fields for account characteristics like: accountNumber, account balance, customer name, email and phone number
 *
 * Create getters and setters for each field
 *
 * Create two additional methods:
 *
 * one for depositing funds into the account.
 *
 * one for withdrawing funds from the account.
 *
 * A customer should not be allowed to withdraw funds, if that withdrawal takes their balance negative
 *
 * Create a new project called ClassChallenge, with the usual main class with the usual main method
 *
 * You'll create an instance of an Account class and then test your withdrawal and deposit methods.
 *
 * You'll print information to the console, that confirms what the balance is after te methods are called.
 *
 * You want to make this class encapsulated, so you'll make all your attributes private, and set up getter and setter methods for your attributes.
 *
 * In addition, you'll have two behavioural methods, for depositing funds, and withdrawing funds.
 *
 * In addition to this class, you will set up a Main class, with a main method, that creates at least one instance of the Bank Account class, and simulates
 * depositing and withdrawing money from the account.
 * */

public class ABCBank {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String Email;
    private String PhoneNumber;

    // Constructor
    public ABCBank() {
        System.out.println("Empty Constructor Called");
    }

    public ABCBank(int accountNumber, double accountBalance, String customerName, String Email, String phoneNumber) {
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
        this.customerName = customerName;
        this.Email = Email;
        this.PhoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        accountBalance += amount;
        System.out.println("Deposit of $" + amount + " made. New balanance is $" + accountBalance);
    }

    public void withdraw(double amount) {
        if (accountBalance - amount < 0) {
            System.out.println("Insufficient Funds! You only have $" + accountBalance + " in your account");
        } else {
            accountBalance -= amount;
            System.out.println("Withdrawal of $" + amount + " processed, Remaining balance = $" + accountBalance);
        }
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }


    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }


}
