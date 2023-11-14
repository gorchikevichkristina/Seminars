package lesson4.task4;

// Обобщенный класс NumericFns, который хранит числовое значение типа T.
class NumericFns<T extends Number> {
    T num;

    // Конструктор класса NumericFns, принимающий числовый объект типа T.
    NumericFns(T n) {
        num = n;
    }

    // Метод для возврата абсолютного значения числа.
    double absValue() {
        return Math.abs(num.doubleValue());//возвращает дробную часть любого числа
    }

    // Проверка абсолютного равенства двух объектов NumericFns.
    boolean absEqual(NumericFns<?> ob) { //NumericFns<?> шаблон аргументов позволяет корректно сравнивать разные типы данных
        return this.absValue() == ob.absValue(); // absValue убирает минус и значения равны
    }
}
