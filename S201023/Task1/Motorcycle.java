package S201023.Task1;

public class Motorcycle extends Vehicle {
    public Motorcycle(String name) {
        super(name);
    }

    @Override
    public void start() {
        System.out.println(getName() + " включает двигатель и ускоряется.");
    }
}
