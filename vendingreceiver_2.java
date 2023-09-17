import java.util.Scanner;

/**
 * Version 2 of <code>vendingreceiver</code> file.
 * HW Week 2 CSCI 70900
 * 
 * @author B.Cornish
 * @collaborator P.Chu
 * @collaborator L.Moffitt
 * @version 2.0 Sept 16, 2023
 */

public class vendingreceiver_2 {

    /**
     * @param args nil
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String moneyIn;

        double balance = 0.0; // inital balance

        int vend = 0;   // flag for requesting vending back out

        while((balance < 3.01) && (vend == 0)) {   // loop while balance is < $3 and we havnt pressed "vend"
            //System.out.println(vend);
            System.out.print("Please enter a coin : ");
    
            moneyIn = in.next();  // read next input
            
            // System.out.println("Coin in: " + moneyIn);
            
            switch (moneyIn) {
    
                case ("p"): // penny
                    balance += 0.01;
                    break;
                case ("P"): // penny
                    balance += 0.01;
                    break;
                case ("n"): // nickel
                    balance += 0.05;
                    break;
                case ("N"): // nickel
                    balance += 0.05;
                    break;
                case ("d"): // dime
                    balance += 0.10;
                    break;
                case ("D"): // dime
                    balance += 0.10;
                    break;
                case ("q"): // quarter
                    balance += 0.25;
                    break;
                case ("Q"): // quarter
                    balance += 0.25;
                    break;
                case ("h"): // half dollar
                    balance += 0.50;
                    break;
                case ("H"): // half dollar
                    balance += 0.50;
                    break;
                case ("g"): // golden dollar
                    balance += 1.00;
                    break;
                case ("G"): // golder dollar
                    balance += 1.00;
                    break;
                case ("V"):
                    vend = 1;
                    break;
                case ("v"):
                    vend = 1;
                    break;
                default:
                    System.out.println("Invalid Coin Entered");
            } // close switch

        System.out.printf("Your balance is $%.2f\n", balance);

        } // close loop
       
        in.close();  // close Scanner
        
    } // close main
}
