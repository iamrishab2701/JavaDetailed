package Challenge.ClassChallenge;

public class Main {

    public static void main(String[] args) {

//        ABCBank bobsAccount = new ABCBank(123455,
//                1000.00,
//                "Bob",
//                "bob@bob.com",
//                "43423423423");

        ABCBank bobsAccount = new ABCBank();
        ABCBank mikeAccount = new ABCBank("Mike", "mik@mik.com", "342432423432");

        System.out.println(bobsAccount.getAccountBalance());
        System.out.println(bobsAccount.getAccountNumber());
        System.out.println(bobsAccount.getCustomerName());
        System.out.println(bobsAccount.getEmail());
        System.out.println(bobsAccount.getPhoneNumber());


        bobsAccount.withdraw(100.0);
        bobsAccount.deposit(250.0);
        bobsAccount.withdraw(50.0);

        bobsAccount.withdraw(200);

        bobsAccount.deposit(100);
        bobsAccount.withdraw(45.55);
        bobsAccount.withdraw(54.46);

        bobsAccount.withdraw(54.45);
    }
}
