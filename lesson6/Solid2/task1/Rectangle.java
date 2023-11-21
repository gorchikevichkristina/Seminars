package lesson6.Solid2.task1;

class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}

class AreaCalculator {
    public double calculateArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHeight();
    }
}