package dependency_inversion_principle.Good_example;

// High-level module depends on an abstraction
public interface SwitchableDevice {
    void turnOn();
    void turnOff();
}
