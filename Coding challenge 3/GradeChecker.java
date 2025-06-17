package coding_challenge_3;

public class GradeChecker {
    public static void main(String[] args) {

        int marks = 78;  // Example marks

        // if else statements that print different messages depending on the marks
        if (marks >= 90) {
            System.out.println("You got an A grade");
        }
        else if (marks >= 75) {
            System.out.println("You got a B grade");
        }
        else if (marks >= 60) {
            System.out.println("You got a C grade");
        }
        else if (marks >= 50) {
            System.out.println("You got a D grade");
        }
        else {
            System.out.println("You failed the exam");
        }
    }
}
