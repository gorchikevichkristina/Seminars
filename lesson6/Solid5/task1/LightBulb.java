package lesson6.Solid5.task1;

class LightBulb {
    public void turnOn() {
        // Включить лампочку
    }
}

class Switch {
    private LightBulb bulb;

    public Switch() {
        bulb = new LightBulb();
    }

    public void operate() {
        bulb.turnOn();
    }
}
