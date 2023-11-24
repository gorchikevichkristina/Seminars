package S24112023.task2;

// Создаем интерфейс Creator, который объявляет фабричный метод createProduct().
// Конкретные создатели реализуют этот метод для создания конкретных продуктов.
interface Creator {
    Product createProduct();
}