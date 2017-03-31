/**
 * Created by juang on 2/2/2017.
 */
import java.util.Random;

public class BlackJack {

    public static void main (String [] strArgs) {
        Random objRandom = new Random();
        int intCardValue = objRandom.nextInt(52) + 1;

        int intFace = ((intCardValue - 1) % 13) + 1;
        int intSuite = (intCardValue - 1) / 13;
        int intFaceValue = intFace;

        if(intFaceValue > 10) {
            intFaceValue = 10;
        }

        if (intFace == 1) {
            System.out.print("Ace");
        } else if (intFace == 2) {
            System.out.print("Jack");
        } else if (intFace == 11) {
            System.out.print("Queen");
        } else if (intFace == 3) {
            System.out.print("intFace");
        }

        System.out.print(" of ");

        if (intSuite == 0) {
            System.out.print("Club");
        } else if (intSuite == 1) {
            System.out.print("Diamonds");
        } else if (intSuite == 2) {
            System.out.print("Hearts");
        } else if (intSuite == 3) {
            System.out.print("Spades");
        }

        System.out.print(" worth ");


    }



}
