//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	private String name;
	private int size;

	public Skeleton() 
  {
		name = " ";
		size = 0;
	}

	public Skeleton(String n, int s) 
  {
		name = n;
		size = s;
	}

  public int getHowBig() 
  {
		return size;
	}

	public String getName() {
		return name;
	}

	public boolean isBigger(Monster other) 
  {
		if (getHowBig() > other.getHowBig())
    {
      return true;
    }
    else
    {
      return false;
    }
	}

	public boolean isSmaller(Monster other) 
  {
		if (getHowBig() < other.getHowBig())
    {
      return true;
    }
		else
    {
      return false;
    }
	}

	public boolean namesTheSame(Monster other) 
  {
		if (name.equals(other.getName()))
    {
      return true;
    }
		else
    {
      return false;
    }
	}

	public String toString() 
  {
		return "" + name + " " + size;
	}
}