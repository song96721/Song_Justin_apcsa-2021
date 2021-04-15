//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song
https://github.com/song96721/Song_Justin_apcsa-2021/tree/main/Unit%2014
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
    		Grid grid = new Grid(3, 3, new String[] {"a", "b", "c"});
	  	System.out.println(grid);
	  	System.out.println(grid.findMax(new String[] {"a", "b", "c"}));
	}
}
