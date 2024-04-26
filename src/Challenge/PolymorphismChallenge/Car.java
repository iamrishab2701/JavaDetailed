package Challenge.PolymorphismChallenge;

public class Car {

    private String description;

    public Car(String description) {
        this.description = description;
    }

    public void startEngine() {
        if (this.getClass().getSimpleName().equalsIgnoreCase("gasPoweredCar")) {
            System.out.println("Engine is starting");
        } else if (this.getClass().getSimpleName().equalsIgnoreCase("ElectricCar")) {
            System.out.println("Battery loaded and Electric Motor is started");
        } else if (this.getClass().getSimpleName().equalsIgnoreCase("HybridCar")) {
            System.out.println("Battery loaded and Engine and Electric Motor both is started");
        } else {
            System.out.println("Car type is known couldn't start");
        }
    }

    public void drive() {
        if (this.getClass().getSimpleName().equalsIgnoreCase("gasPoweredCar")) {
            System.out.println("Driving gas powered car");
        } else if (this.getClass().getSimpleName().equalsIgnoreCase("ElectricCar")) {
            System.out.println("Driving Electric Car");
        } else if (this.getClass().getSimpleName().equalsIgnoreCase("HybridCar")) {
            System.out.println("Driving Hybrid Car");
        } else {
            System.out.println("Car type is unknown couldn't start");
        }
    }

    protected void runEngine() {
        if (this.getClass().getSimpleName().equalsIgnoreCase("gasPoweredCar")) {
            System.out.println("Engine Running");
        } else if (this.getClass().getSimpleName().equalsIgnoreCase("ElectricCar")) {
            System.out.println("Electric Motor Running");
        } else if (this.getClass().getSimpleName().equalsIgnoreCase("HybridCar")) {
            System.out.println("Engine Running and Electric Motor started");
        } else {
            System.out.println("Engine or Motor Unidentified");
        }
    }
}

class gasPoweredCar extends Car {
    private double avgKmPerLitre;
    private int cylinder;

    public gasPoweredCar(String description, double avgKmPerLitre, int cylinder) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinder = cylinder;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Gas Tank is Full");
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println("Changing gears and drive");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
        System.out.println("Engine started with all " + cylinder + " cylinder in use.");
    }

}

class ElectricCar extends Car {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Electric Motor Started");
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println();
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}

class HybridCar extends Car {
    private double avgKmPerLitre;
    private int batterSize;
    private int cylinder;

    public HybridCar(String description, double avgKmPerLitre, int batterSize, int cylinder) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterSize = batterSize;
        this.cylinder = cylinder;

    }

    @Override
    public void startEngine() {
        super.startEngine();
        System.out.println("Engine and Electric Motor started");
    }

    @Override
    public void drive(){
        super.drive();
        System.out.println("Driving on battery and ");
    }

    @Override
    protected void runEngine() {
        super.runEngine();
    }
}
