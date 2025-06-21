package liskov_substitution_principle.Good_example;

public class Ostrich implements Bird {
    public void eat() {
        System.out.println("Ostrich is eating");
    }
    // No fly method — because it doesn’t fly
}
