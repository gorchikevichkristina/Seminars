package S241123.task2;

class ConcreteCreatorB implements Creator {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
