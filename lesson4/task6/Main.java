package lesson4.task6;

public class Main {
    public static void main(String[] args) {
        B b = new B();
        Gen<? extends A> gen = new Gen<>(b);

        // Теперь вы можете получить объект типа A или его подкласса
        A a = gen.getObj();
        System.out.println(a.getClass().getSimpleName()); // Выведет "B", так как gen содержит объект типа B
    }
}