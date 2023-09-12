import java.io.*;
import java.util.*;

public class VendingCents {

    public static void main(String[] args) {
        //converts arg into int
        int amount = Integer.parseInt(args[0]);
        
        //Initializes amount of coins
        int goldenDollars = 0;
        int halfDollars = 0;
        int quarters = 0;
        int dimes = 0;
        int nickels = 0;
        int pennies = 0;

        //validating if amount is divisible by goldenDollar (1)
        if (amount/100 > 0) {
          //storing number of goldendollars
          goldenDollars = amount/100;
          //subtract goldendollars from amount
          amount = amount - goldenDollars * 100;
        }
        //validating if amount is divisible by halfDollar (1)
        if (amount/50 > 0) {
          //storing number of goldendollars
          halfDollars = amount/50;
          //subtract halfDollar from amount
          amount = amount - halfDollars * 50;
        }
        //validating if amount is divisible by goldenDollar (1)
        if (amount/25 > 0) {
          //storing number of quarters
          quarters = amount/25;
          //subtract quarters from amount
          amount = amount - quarters * 25;
        }
        if (amount/10 > 0) {
          //storing number of dimes
          dimes = amount/10;
          //subtract dimes from amount
          amount = amount - dimes * 10;
        }
        if (amount/5 > 0) {
          //storing number of nickels
          nickels = amount/5;
          //subtract nickels from amount
          amount = amount - nickels * 5;
        }
       if (amount/1 > 0) {
          //storing number of pennies
          nickels = amount/1;
          //subtract pennies from amount
          amount = amount - pennies * 5;
        }

      
        System.out.printf("Here are %d golden dollars, %d half dollars, %d quarters, %d dimes, and %d pennies", goldenDollars, halfDollars, quarters, dimes, nickels, pennies);
    }
}


// The denominations you are using are golden dollar coin ($1.00 or 100 cents), half dollar
// coin ($0.50), quarter ($0.25),
