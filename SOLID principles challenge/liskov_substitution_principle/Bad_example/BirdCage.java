package liskov_substitution_principle.Bad_example;

public class BirdCage {
    public void letBirdFly(Bird bird) {
        bird.fly();  // This will break if the bird is an Ostrich
    }
}