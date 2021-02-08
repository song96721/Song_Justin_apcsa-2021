//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b ){
    double sub;
    if (a > b)
    {
      sub = (a - b);
    }
    else if (b > a)
    {
      sub = (b - a);
    } 
    else
    {
      sub = (a * b);
    }
    return sub;
	}
}
