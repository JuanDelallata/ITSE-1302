/**
 * Created by juang on 3/21/2017.
 * Juan Delallata
 * ITSE 1302
 */


import java.util.Random;
import java.util.Scanner;

public class HiLowGuessingGame {

    public static void main(String [] strArgs) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        int number = random.nextInt(100);
        int guess = 23;

        while (guess!=number) {
            System.out.print("Type in your guess: ");
            guess = scanner.nextInt();

            if (guess < number) {
                System.out.println("Too Low .... Try Again");
            } else if (guess > number) {
                System.out.println("Too High .... Try Again");
            } else {
                System.out.println("You got it, the number was " + number);
            }
        }

    }
}
