//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song
//Date - 3/9

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static boolean go( List<Integer> ray )
	{
		return false;
	}

  public static int distance( List<Integer> ray) 
  {
		Integer odd = null;
		Integer even = null;
		int i = 0;
		
		int count = 0;
		for (i = 0; i < ray.size(); i++) {
			if(ray.get(i) % 2 == 1) {
				odd = ray.get(i);
				break;
			}
		}
		for (int j = i; j < ray.size(); j++) 
    {
			if (ray.get(j) % 2 ==0) 
      {
				even = ray.get(j);
				count = j;
			}
		}
		if (odd == null || even == null) 
     {
			return -1;
		}
		else 
    {
			return count - i;
		}
	}
}