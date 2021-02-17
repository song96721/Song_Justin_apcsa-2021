//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		    Perfect num = new Perfect();
    		System.out.println(num.toString());

    		num =  new Perfect(45);
    		System.out.println(num.toString());

    		num =  new Perfect(6);
    		System.out.println(num.toString());

    		num =  new Perfect(14);
    		System.out.println(num.toString());

    		num =  new Perfect(8128);
    		System.out.println(num.toString());

    		num =  new Perfect(1245);
    		System.out.println(num.toString());

    		num =  new Perfect(33);
    		System.out.println(num.toString());

    		num =  new Perfect(28);
    		System.out.println(num.toString());

    		num =  new Perfect(27);
    		System.out.println(num.toString());

    		num =  new Perfect(33550336);
    		System.out.println(num.toString());										
	}
}
