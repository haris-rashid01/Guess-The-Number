package p2;

import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int ran = random.nextInt(100);
        System.out.println("You can now guess");


        int counter = 0;
        int number;
        do {
            System.out.println("Enter any number");
            number = sc.nextInt();
            if (number > ran) {
                System.out.println("Your Number is greater than the actual number");
            } else if (number < ran) {
                System.out.println("Your number is lesser than the actual number");
            }

            counter = counter + 1;
        } while (number != ran);
        System.out.println("Congratulations, You have guesses the number");
        System.out.println("The number was: " + ran);
    }

}
