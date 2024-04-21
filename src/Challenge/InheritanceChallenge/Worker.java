package Challenge.InheritanceChallenge;

public class Worker {

    /*
     * Challenge is to create the worker class, the Employee class, and either the SalariedEmployee, or the
     * HourlyEmployee class
     *
     * For each class, create the attributes and methods
     *
     * Create a main method that will create either a SalariedEmployee or HourlyEmployee, and call the methods, getAge,
     * collectPay, and the method shown for the specific type of class you decide to implement.
     *
     * So if you implement SalariedEmployee, then execute retire
     *
     * If you implement HourlyEmployee, then execute getDoublePay()
     * */

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker(){};

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        int currentYear = 2024;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return currentYear - birthYear;
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
