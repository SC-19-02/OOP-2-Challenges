package single_responsibility_principle.Bad_example;

public class Printer {
    public void print(String text) {
        System.out.println("Printing: " + text);
    }

    public void scan() {
        System.out.println("Scanning document...");
    }
}
