package Challenge.EncapsulationChallenge;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(10, true);
        System.out.println(printer.addToner(10));
        System.out.println(printer.printPages(2));
        System.out.println("Total number of pages printed are = " + printer.getPagesPrinted());

    }
}
