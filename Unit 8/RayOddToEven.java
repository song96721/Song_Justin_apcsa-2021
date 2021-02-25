//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song
//Date - 2/23/21

public class RayOddToEven
{
	public static boolean go(int[] ray)
	{
		return false;
	}
	
	public static int checker(int arr[]) 
  	{
		int odd = 0;
		int even = 0;

		for (int i = 0;i < arr.length;i++) 
    		{
			if (arr[i] % 2 == 1) 
      			{
				odd = i;
				break;
			}
		}
		for (int i = odd + 1;i < arr.length;i++) 
    		{
			if (arr[i] % 2 == 0) 
      			{
				even = i;
				break;
			}
		}
		if(even - odd > 0) 
    		{
			return even - odd;
		}
		else 
    		{
			return -1;
		}
	}
}
