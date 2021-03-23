//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song

import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList= new ArrayList<Toy>();
	}

	public void loadToys(String toys)
	{
		for( String name : toys.split(" "))
		{
			Toy t = getThatToy(name);
			if (t == null)
			{
				toyList.add(new Toy(name));
			}
			else
			{
				t.setCount(t.getCount()+1);
			}
	  }
  } 
  
  public Toy getThatToy( String nm )
  {
  	for(Toy x : toyList)
		{
		if(x.getName().equals(nm))
			{
				return x;
			}
		}
  	return null;
  }
  
  public String getMostFrequentToy()
  {
  	String name = "";
		double max = Integer.MIN_VALUE;
		for(Toy x: toyList)
		{
			if(max < x.getCount())
			{
				max = x.getCount();
				name = x.getName();
			}
		}
		return name;
  }
  
  	public void sortToysByCount()
  	{
  		Toy temp;
      for (int i = 0; i < toyList.size(); i++)
      {
        for (int j = i; j < toyList.size(); j++)
        {
          if (toyList.get(j).getCount() > toyList.get(i).getCount())
          {
            temp = toyList.get(j);
            toyList.set(j, toyList.get(i));
            toyList.set(i, temp);
          }
        }
      }
  	}  
  	  
	public String toString()
	{
	   return "" + toyList;
	}
}
