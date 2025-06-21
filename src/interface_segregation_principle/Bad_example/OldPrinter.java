package interface_segregation_principle.Bad_example;

public class OldPrinter implements Machine {
    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        // Not supported
        throw new UnsupportedOperationException("Scan not supported");
    }

    public void fax() {
        // Not supported
        throw new UnsupportedOperationException("Fax not supported");
    }
}
