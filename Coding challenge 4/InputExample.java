package coding_challenge_4;
import java.util.Scanner;

public class InputExample {
    Scanner scanner = new Scanner(System.in); // scanner to get user input

    public void readNameAndAge() {
        String name; // variable to store name
        int age; // variable to store age

        System.out.print("Enter your name: "); // asks for name
        name = scanner.next(); // reads name

        System.out.print("Enter your age: "); // asks for age
        age = scanner.nextInt(); // reads age

        System.out.println("Hello " + name + " you are " + age + " springs young"); // prints message
    }
}
