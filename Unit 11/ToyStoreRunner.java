//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
    ToyStore sto = new ToyStore();
	  sto.loadToys("sorry bat sorry sorry sorry train train teddy teddy ball ball" );
	  System.out.println(sto);	
	  System.out.println( "max == " + sto.getMostFrequentToy() );	
	  sto.sortToysByCount();
	  System.out.println( "sort == " + sto);	
	}
}