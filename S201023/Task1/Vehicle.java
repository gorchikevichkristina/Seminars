package S201023.Task1;

public class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void start() {
        System.out.println(name + " начинает движение.");
    }

    public void stop() {
        System.out.println(name + " останавливается.");
    }
}
