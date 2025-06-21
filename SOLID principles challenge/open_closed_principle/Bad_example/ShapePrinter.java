package open_closed_principle.Bad_example;

public class ShapePrinter {
    public void printShape(String shapeType) {
        if (shapeType.equals("Circle")) {
            System.out.println("Printing Circle");
        } else if (shapeType.equals("Square")) {
            System.out.println("Printing Square");
        }
    }
}
