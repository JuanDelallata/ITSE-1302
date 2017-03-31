import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Created by juang on 3/16/2017.
 * ITSE 1302
 * Exercise 10
 */
public class MilesFormat {


    public static void main(String[] strArgs) {
        Scanner objInput = new Scanner(System.in);
        double dblMiles = 32;
        double dblGas = .33;
        DecimalFormat fmtdblMiles = new DecimalFormat("0.##");
        java.text.NumberFormat fmtdblGas = NumberFormat.getCurrencyInstance();
        System.out.print("Please enter the number of miles: ");
        dblMiles = objInput.nextDouble();

        double kilometers = dblMiles * 1.6;
        double gas = kilometers * 0.33;
        //dblMiles = objInput.nextDouble();

        System.out.println("Equals to: " + kilometers + " Kilometers");
        System.out.println("Gas: " + fmtdblGas.format(gas));

    }
}
