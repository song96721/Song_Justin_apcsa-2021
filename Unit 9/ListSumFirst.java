//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song
//Date - 3/9/21

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		if (ray.size() == 0) 
    {
			return -1;
		}
		int count = 0;
		int i = 0;
		for(int x:ray) 
    {
			if (x > ray.get(0)) 
      {
				count = count + x;
				i++;
			}
		}
		if (i == 0) 
    {
			return -1;
		}
		else
    {
      return count;
    }
	}
}