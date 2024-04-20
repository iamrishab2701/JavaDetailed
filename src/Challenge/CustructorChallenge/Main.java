package Challenge.CustructorChallenge;

public class Main {

    public static void main(String[] args) {
        Customer bobCustomer = new Customer();
        System.out.println(bobCustomer.getName());
        System.out.println(bobCustomer.getEmail());
        System.out.println(bobCustomer.getCreditLimit());

        Customer mikeCustomer = new Customer("Mike", 1000.121, "mike@mike.com");
        System.out.println(mikeCustomer.getName());
        System.out.println(mikeCustomer.getEmail());
        System.out.println(mikeCustomer.getCreditLimit());

        Customer johnCustomer = new Customer("John", "john@john.com");
        System.out.println(johnCustomer.getName());
        System.out.println(johnCustomer.getEmail());
    }
}
