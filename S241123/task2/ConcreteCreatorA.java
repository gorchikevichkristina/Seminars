package S241123.task2;

// которые реализуют фабричный метод для создания конкретных продуктов.
class ConcreteCreatorA implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
