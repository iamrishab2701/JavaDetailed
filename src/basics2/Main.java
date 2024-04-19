package basics2;

public class Main {

    public static void main(String[] args) {

        Car car = new Car();
        car.setMake("Porsche");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setColor("Black");
        car.setConvertible(true);
        System.out.println("Make = " + car.getMake());
        System.out.println("model = " + car.getModel()); // Accessing private variable using getter methods.
        car.describeCar();

        Car targa = new Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(2);
        targa.setColor("red");
        targa.setConvertible(false);

        targa.describeCar();
    }
}