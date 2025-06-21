package interface_segregation_principle.Good_example;

public class MultiFunctionPrinter implements Printer, Scanner, FaxMachine {
    public void print() {
        System.out.println("Printing...");
    }

    public void scan() {
        System.out.println("Scanning...");
    }

    public void fax() {
        System.out.println("Faxing...");
    }
}
