//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Justin Song
//Date - 2/5/2021
//Class - APCSA Period 3
//Lab  - Discount

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	public static double getDiscountedBill(double bill){
    double b;
    if (bill > 2000)
    {
      b  = (0.85 * bill);
    }
    else
    {
      b = bill;
    }
    return b;
  }
}
