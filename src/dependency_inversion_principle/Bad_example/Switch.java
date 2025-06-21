package dependency_inversion_principle.Bad_example;

public class Switch {
    private LightBulb bulb;

    public Switch(LightBulb bulb) {
        this.bulb = bulb;
    }

    public void operate() {
        bulb.turnOn();  // tightly coupled to LightBulb
    }
}