//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song
//Date - 2/23/21

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int count = 0;
		for (int i = 0;i < ray.length - 1;i++) 
    		{
			if (ray[i] > ray[ray.length-1]) 
      			{
				count = count + ray[i];
			}
		}
		if (count > 0) 
    		{
			return count;
		}
		else 
    		{
			return -1;
		}
	}
}
