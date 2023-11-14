package S201023.Task1;

public class VehicleDemo {
    public static void main(String[] args) {
// Создаем разные виды транспортных средств
        Vehicle car = new Car("Машина");
        Vehicle motorcycle = new Motorcycle("Мотоцикл");

// Используем полиморфизм для вызова метода start()
        car.start();
        motorcycle.start();

// Мы также можем вызвать общий метод stop() для всех транспортных средств
        car.stop();
        motorcycle.stop();
    }
}
