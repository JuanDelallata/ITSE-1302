/**
 * Created by juang on 3/16/2017.
 */


import java.util.Scanner;
import java.text.DecimalFormat;





public class NumberFormat {
        public static void main(String [] strArgs){
            Scanner objInput = new Scanner(System.in);
            double dblMiles = 32;
            double dblGas = .33;
            DecimalFormat fmtdblMiles = new DecimalFormat("0.##");
            java.text.NumberFormat fmtdblGas = java.text.NumberFormat.getCurrencyInstance();
            System.out.print("Please enter the number of miles: ");
            dblMiles = objInput.nextDouble();

            double kilometers = dblMiles * 1.6;
            double gas = kilometers * 0.33;
            //dblMiles = objInput.nextDouble();

            System.out.println("Equals to: " + kilometers + " Kilometers");
            System.out.println("Gas: " + fmtdblGas.format(gas));


        }
    }

