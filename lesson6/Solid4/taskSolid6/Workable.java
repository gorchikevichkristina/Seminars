package lesson6.Solid4.taskSolid6;

interface Workable {
    void work();
}

interface Eatable {
    void eat();
}

interface Sleepable {
    void sleep();
}

class Engineer implements Workable, Sleepable {
    @Override
    public void work() {
        // Работа инженера
    }

    @Override
    public void sleep() {
        // Сон после работы
    }
}

class Waiter implements Workable, Eatable, Sleepable {
    @Override
    public void work() {
        // Обслуживание клиентов
    }

    @Override
    public void eat() {
        // Перерыв на обед
    }

    @Override
    public void sleep() {
        // Сон после работы
    }
}