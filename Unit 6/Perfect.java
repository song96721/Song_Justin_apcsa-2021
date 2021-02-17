//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song

import static java.lang.System.*;

public class Perfect
{
  private int number;

  public Perfect()
  {
    number = 496;
  }

  public Perfect(int num)
  {
    number = num;
  }
	
  public void setPerfect(int num)
  {
    number = num;
  }

  public boolean isPerfect()
  {
    int count = 0;
    int i = 1;
    while (i <= number/2)
    {
      if (number % i == 0)
      {
        count += i;
      }
      i++;
    }
    if (count == number)
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
    if(isPerfect())
    {
      return number + " is perfect";
    }
    else
    {
      return number + " is not perfect";
    }
  }	
}
