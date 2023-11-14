package lesson4.task6;

class Gen<T extends A> {
    T obj;

    Gen(T o) {
        obj = o;
    }

    T getObj() {
        return obj;
    }
}
