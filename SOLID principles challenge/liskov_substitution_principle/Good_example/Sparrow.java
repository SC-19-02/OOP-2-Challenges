package liskov_substitution_principle.Good_example;

public class Sparrow implements FlyingBird {
    public void eat() {
        System.out.println("Sparrow is eating");
    }
    public void fly() {
        System.out.println("Sparrow is flying");
    }
}