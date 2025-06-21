package dependency_inversion_principle.Good_example;

public class LightBulb implements SwitchableDevice {
    public void turnOn() {
        System.out.println("LightBulb is ON");
    }

    public void turnOff() {
        System.out.println("LightBulb is OFF");
    }
}
