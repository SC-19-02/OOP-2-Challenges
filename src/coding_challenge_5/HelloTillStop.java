package coding_challenge_5;

import java.util.*;

public class HelloTillStop {
    Scanner sc = new Scanner(System.in); // scanner to get user input

    public void showHello() {
        String choice; // variable to store what user types

        System.out.println("For hello type h, anything else to stop"); // instruction
        choice = sc.next(); // gets user input

        // while loop keeps running as long as user types 'h'
        while (choice.equals("h")) {
            System.out.println("Hello"); // prints hello if user types 'h'
            choice = sc.next(); // asks again for user input
        }
    }
}
