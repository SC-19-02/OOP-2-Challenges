package dependency_inversion_principle.Good_example;

public class Switch {
    private SwitchableDevice device;

    public Switch(SwitchableDevice device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}
