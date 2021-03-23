//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int num;
	private int denom;

	public Rational()
  {
		num = 1;
		denom = 1;
  }

  public Rational(int n, int d)
  {
		num = n;
		denom = d;
  }

  public int num() 
  {
		return num;
	}
	
	public int denom() 
  {
		return denom;
  }

  public void setRational (int n, int d) 
  {
		num = n;
		denom = d;
	}

	public void add(Rational  other)
	{
		Rational retAdd = new Rational(0, 0);
		if(this.denom == other.denom) 
    {
			retAdd.num = this.num + other.num;
			retAdd.denom = this.denom;
			num = retAdd.num();
			denom = retAdd.denom();
		} 
    else 
    {
			retAdd.num = this.num * other.denom;
			retAdd.denom = this.denom * other.denom;
			other.num = other.num * this.denom;
			other.denom = other.denom * this.denom;
			retAdd.num += other.num;
			
			int remain, num1, num2;
			num1 = retAdd.num;
			num2 = retAdd.denom;
			remain = num1 % num2;
			while(remain != 0) {
				remain = num1 % num2 ;
				num1 = num2;
				num2 = remain;
			}
			int GCD = num1;
			
			this.num = retAdd.num/gcd(retAdd.num(),retAdd.denom());
			this.denom = retAdd.denom/gcd(retAdd.num(),retAdd.denom());
			
			
		}
		reduce();
		
	}

	private void reduce()
	{
    this.num = this.num/gcd(num,denom);
		this.denom = this.denom/gcd(num,denom);
	}

	private int gcd(int numOne, int numTwo)
	{
    int remaind, num1, num2;
		num1 = numOne;
		num2 = numTwo;
		remaind = num1 % num2;
		while(remaind != 0) 
    {
			remaind = num1 % num2 ;
			num1 = num2;
			num2 = remaind;
		}
		int GCD = num1;

		return GCD;
	}

	public Object clone ()
	{
		Rational ration = new Rational(num,denom);
		return ration;
	}

	public boolean equals( Rational obj)
	{
    this.reduce();
		obj.reduce();

		if(this.num == obj.num && this.denom == obj.denom) 
    {
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
    int w = -1;
		double d1 = (double)this.num/this.denom;
		double d2 = (double)other.num/other.denom;
		if(d1>d2) 
    {
			w = 1;
		}
		else if(d1 == d2) 
    {
			w = 0;
		}
		return w;
	}

  public  String toString() 
  {
		return num + "/" + denom;
	}
	
	
}