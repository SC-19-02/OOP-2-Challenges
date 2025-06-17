package coding_challenge_2;

public class Variables {
    public void showInterest() {
        double amount; // variable to store amount
        double interest; // variable to store interest rate

        amount = 1200.00; // starting amount
        System.out.println("Amount: " + amount); // prints initial amount

        interest = 3.0; // interest rate is 3%
        amount = amount * (100+interest)/100; // adds interest for 1 year
        System.out.println("after a year: " + amount); // prints amount after 1 year

        amount = amount * (100+interest)/100; // adds interest for 2nd year
        System.out.println("after 2 years: " + amount); // prints amount after 2 years
    }
}
