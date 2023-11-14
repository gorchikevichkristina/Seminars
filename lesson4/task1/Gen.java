package lesson4.task1;
// Обобщенный класс Gen
class Gen<T> { //T это тип
    T ob; //просто объект, переменная

    Gen(T o) { //конструктор
        ob = o;
    }

    T getob() { //возвращает переменную ob тип Т
        return ob;
    }

    void showType() {
        System.out.println("Тип T - это " + ob.getClass().getName());
    }
}