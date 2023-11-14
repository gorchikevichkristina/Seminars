package S201023.Task1;

public class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override //переопределяем метод родительского класса (полиморфизм)
    public void start() {
        System.out.println(getName() + " заводит двигатель и начинает движение.");
    }
}
