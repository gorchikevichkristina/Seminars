package S201023;
//передаем параметры из родительского класса - наследуем
public class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age);
    }

    public void giveBirth() {
        System.out.println(getName() + " рожает молодняк");
    }
}

