/**
 * Juan Delallata 2-7-2017
 * ITSE 1302
 * Assignment else if Example
 */


import java.util.Scanner;
public class Logic {

    public static void main (String [] strArgs)  {
        Scanner objInput = new Scanner(System.in);
        int intNumberOfVisits = 0;

        System.out.println("Please enter a number between 0 and 6: ");
        intNumberofVisits = objInput.nextInt();

        if(intNumberOfVisits <= 0)  {
            System.out.println("Invalid number!");
        }  else {
            if(1 == intNumberOfVisits) {
                System.out.println("Hello, how are you?");

            }

        }

    }
}
