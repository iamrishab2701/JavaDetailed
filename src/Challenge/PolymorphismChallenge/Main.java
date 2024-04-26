package Challenge.PolymorphismChallenge;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("This is unknown Car");
        car.startEngine();
        car.runEngine();
        car.drive();

        Car car1 = new ElectricCar("Ather", 200, 10);
        car1.startEngine();

    }
}
