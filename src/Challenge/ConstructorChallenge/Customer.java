package Challenge.ConstructorChallenge;

public class Customer {

    /*
    So in this challenge, you'll want to:

    1. Create a new class, called Customer, with three fields, name, credit limit and email address.
    2. Create the getter methods only, for each field. You don't need to create the setters.
    3. Create three constructors for this class
        A. First, create a constructor for all three fields which should assign the arguments directly to the instance fields.
        B. Second, create a no args constructor that calls another constructor, passing some literal values for each argument.
        C. And lastly, create a constructor with just the name and email parameters, which also calls another constructor.

     */


    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer() {
        this("Bob", 1000.124, "bob@bob.com");
    }

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getName() {
        return name;
    }


}
