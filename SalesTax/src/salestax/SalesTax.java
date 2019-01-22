/*
 * Sean O'Brien
 * CSC 206, Intermediate programming
 * This program displays the sales tax with two digits after the decimal point
 */
package salestax;

import java.util.Scanner;

public class SalesTax {

    public static void main(String[] args) {
        // Create Scanner
        Scanner input = new Scanner(System.in);

        // Get user input
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();
        // Calculate and print 
        double tax = purchaseAmount * 0.06;
        System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);

    }
}
