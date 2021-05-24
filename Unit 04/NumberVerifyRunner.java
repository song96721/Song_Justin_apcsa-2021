//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Justin Song
//Date - 2/5/21
//Class - APCSA Period 3
//Lab  - NumberVerifyRunner

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter a whole number:: ");
		int n = keyboard.nextInt();
		System.out.println(n +" is odd :: " + NumberVerify.isOdd(n));
		System.out.println(n +" is even :: " + NumberVerify.isEven(n));

    		out.print("Enter a whole number :: ");
		n = keyboard.nextInt();
		System.out.println(n +" is odd :: " + NumberVerify.isOdd(n));
		System.out.println(n +" is even :: " + NumberVerify.isEven(n));
    
    		out.print("Enter a whole number :: ");
		n = keyboard.nextInt();
		System.out.println(n +" is odd :: " + NumberVerify.isOdd(n));
		System.out.println(n +" is even :: " + NumberVerify.isEven(n));

    		out.print("Enter a whole number :: ");
		n = keyboard.nextInt();
		System.out.println(n +" is odd :: " + NumberVerify.isOdd(n));
		System.out.println(n +" is even :: " + NumberVerify.isEven(n));

    		out.print("Enter a whole number :: ");
		n = keyboard.nextInt();
		System.out.println(n +" is odd :: " + NumberVerify.isOdd(n));
		System.out.println(n +" is even :: " + NumberVerify.isEven(n));
	}
}
