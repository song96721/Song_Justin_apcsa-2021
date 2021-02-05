//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Justin Song
//Date - 2/3/21
//Class - APCSA Period 3
//Lab  - DistanceRunner

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
  public static void main( String[] args )
  {
    Scanner number = new Scanner(System.in);

    System.out.print("Enter X1 :: ");
    int x1 = number.nextInt();
    System.out.print("Enter Y1 :: ");
    int y1 = number.nextInt();
    System.out.print("Enter X2 :: ");
    int x2 = number.nextInt();
    System.out.print("Enter Y2 :: ");
    int y2 = number.nextInt();

    Distance dOne = new Distance(x1,y1,x2,y2);
    dOne.calcDistance();
    dOne.print();

    System.out.print("Enter X1 :: ");
     x1 = number.nextInt();
    System.out.print("Enter Y1 :: ");
     y1 = number.nextInt();
    System.out.print("Enter X2 :: ");
     x2 = number.nextInt();
    System.out.print("Enter Y2 :: ");
     y2 = number.nextInt();
		
    Distance dTwo = new Distance(x1,y1,x2,y2);
    dTwo.calcDistance();
    System.out.println(dTwo.toString());
	
    System.out.print("Enter X1 :: ");
    x1 = number.nextInt();	
    System.out.print("Enter Y1 :: ");
    y1 = number.nextInt();
    System.out.print("Enter X2 :: ");
    x2 = number.nextInt();		
    System.out.print("Enter Y2 :: ");
    y2 = number.nextInt();
			
    Distance dThree = new Distance(x1,y1,x2,y2);
    dThree.calcDistance();
    dThree.print();	
  }
}
