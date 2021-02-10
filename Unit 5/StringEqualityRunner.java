//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Justin Song
//Date - 2/9/21
//Class - APCSA Period 3
//Lab  - StringEqualityRunner

import static java.lang.System.*;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		StringEquality test = new StringEquality();
		System.out.println(test.toString());

    test = new StringEquality("one", "two");
    System.out.println(test.toString());

    test = new StringEquality("three", "four");
    System.out.println(test.toString());

    test = new StringEquality("TCEA", "UIL");
    System.out.println(test.toString());

    test = new StringEquality("State", "Champions");
    System.out.println(test.toString());

    test = new StringEquality("ABC", "ABC");
    System.out.println(test.toString());

    test = new StringEquality("ABC", "CBA");
    System.out.println(test.toString());

    test = new StringEquality("Same", "Same");
    System.out.println(test.toString());

	}
}
