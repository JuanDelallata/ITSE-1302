/**
 * Created by juang on 2/7/2017.
 * Juan Delallata
 * ITSE 1302
 * Rock Paper Scissors Assignment 9
 */


// Paper Rock Scissors two player example game. Computer has just been automated.


import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main (String [] strArgs) {
        String strRock = "Rock";
        String strPaper = "Paper";
        String strScissors = "Scissors";
        String strJuan = "Juan";
        String strChris = "Chris";

        String strPlayerOne = "";
        String strPlayerTwo = strRock;




        Scanner scan = new Scanner(System.in);      // Makes the program interactive
        System.out.print("Player Two: ");           // Player Two Chooses Paper Rock Scissors
        strPlayerTwo = scan.next();

        Random objRandom = new Random();
        int intPlayerOne = objRandom.nextInt(3) +1; // Makes computer automated
        if (intPlayerOne == 1){
            strPlayerOne = strRock;
        } else if (intPlayerOne == 2) {
            strPlayerOne = strPaper;
        } else if (intPlayerOne == 3) {
            strPlayerOne = strScissors;
        }


        if (strPlayerOne.equals(strPlayerTwo)) {        // Test Tie String
            System.out.println("Tie");
        } else if ( (strPlayerOne.equals(strRock) &&
            strPlayerTwo.equals(strScissors))
            || (strPlayerOne.equals(strScissors) &&
            strPlayerTwo.equals(strPaper))
            || (strPlayerOne.equals(strPaper) && strPlayerTwo.equals(strRock)) )
        {
            System.out.println("Player One Wins");
        } else {
            System.out.println("Player Two Wins");
        }
    }
}
