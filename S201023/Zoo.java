package S201023;

//запускаем
public class Zoo {
    public static void main(String[] args) {

        //присваиваем ссылки
        Animal lion = new Animal("Лев", 5);
        Mammal elephant = new Mammal("Слон", 10);
        lion.speak();
        elephant.speak();

        lion.setName("Кот");
        lion.speak();

    }
}
