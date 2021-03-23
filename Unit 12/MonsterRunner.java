//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter 1st monster's name : ");
		String name = keyboard.next();
		keyboard.nextLine();
		System.out.println("Enter 1st monster's size : ");
		int size = keyboard.nextInt();

		Skeleton one = new Skeleton(name, size);

		System.out.println("Enter 2nd monster's name : ");
		String n = keyboard.next();
		keyboard.nextLine();
		System.out.println("Enter 2nd monster's size : ");
		int s = keyboard.nextInt();

		Skeleton two = new Skeleton(n, s);
		
    System.out.println(one);
		System.out.println(two);
		one.isBigger(two);
		two.namesTheSame(one);


	}
}