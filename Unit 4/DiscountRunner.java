//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Justin Song
//Date - 2/5/21
//Class - APCSA Period 3
//Lab  - DiscountRunner

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
    amt = Discount.getDiscountedBill(amt);
    out.printf("Bill after discount:: %.3f \n", amt);

    out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
    amt = Discount.getDiscountedBill(amt);
    out.printf("Bill after discount:: %.3f \n", amt);

    out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
    amt = Discount.getDiscountedBill(amt);
    out.printf("Bill after discount:: %.3f \n", amt);

    out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
    amt = Discount.getDiscountedBill(amt);
    out.printf("Bill after discount:: %.3f \n", amt);

    out.print("Enter the original bill amount :: ");
		amt = keyboard.nextDouble();
    amt = Discount.getDiscountedBill(amt);
    out.printf("Bill after discount:: %.3f \n", amt);
		

	}
}
