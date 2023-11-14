package S201023;

//Родительский класс
public class Animal {
    private String name; //инкапсуляция защищает от изменений
    private int age; //инкапсуляция

    // Конструктор - обычный метод, с названием по имени класса
    public Animal(String name, int age) {
        this.name = name; //this передает 4 строку и 5 строку
        this.age = age; // изменять их нельзя
    }

    //методы - общие/повторяющиеся действия для животных
    public void speak() {
        System.out.println(getName() + " издает звук");
    }

    public void eat() {
        System.out.println(getName() + " ест");
    }

    public String getName() {
        return name;
    }
    //геттеры и сеттеры делаются для инкапсуляции

    public void setName(String name) { // задает значение
        this.name = name;
    }

    public int getAge() { // возвращает значение
        return age;
    }

    public void setAge(int age) { // задает значение
        this.age = age;
    }
}
