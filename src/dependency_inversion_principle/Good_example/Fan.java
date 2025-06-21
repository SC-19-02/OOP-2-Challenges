package dependency_inversion_principle.Good_example;

public class Fan implements SwitchableDevice {
    public void turnOn() {
        System.out.println("Fan is spinning");
    }

    public void turnOff() {
        System.out.println("Fan is stopped");
    }
}
