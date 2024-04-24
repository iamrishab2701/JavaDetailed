package basics3.ComputerFactory;

public class Main {

    public static void main(String[] args) {

        ComputerCase computerCase = new ComputerCase("2208", "Dell", "240");
        Monitor monitor = new Monitor("27 inch Beast", "Acer", 27, "2540 x 1440");
        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
        PersonalComputer personalComputer = new PersonalComputer("2208", "Dell", computerCase, monitor, motherboard);

        // Composition
//        personalComputer.getMonitor().drawPixelAt(10, 10, "red");
//        personalComputer.getMotherboard().loadProgram("Windows OS");
//        personalComputer.getComputerCase().pressPowerButton();

        personalComputer.powerUp();
    }
}
