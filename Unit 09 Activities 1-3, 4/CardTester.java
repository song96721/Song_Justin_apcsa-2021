//CSA - Period 3
//Name - Justin Song
public class CardTester 
{
	public static void main(String[] args) 
  	{
    		//Create three Card objects and test each method for each Card object.
    		Card one = new Card("9", "Clover", 9);
    		Card two = new Card("2", "Hearts",2);
    		Card three = new Card("5", "Spades", 5);
  
    		System.out.println(one.suit());
		System.out.println(one.rank());
		System.out.println(one.pointValue());
		System.out.println(one.matches(two));
		System.out.println(one.toString());
	}
}
