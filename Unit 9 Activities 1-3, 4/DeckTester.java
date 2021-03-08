//CSA - Period 3
//Name - Justin Song
public class DeckTester 
{
	public static void main(String[] args) 
  {
		String[] ranks = {"4", "8", "Queen"};
		String[] suits = {"Hearts", "Spades", "Diamonds"};
		int[] values = {4, 8, 12};
	  Deck deck = new Deck(ranks, suits, values);
		
		for(int i = 0; i < 52; i++)
		{
		    String rank = "";
		    String suit = "";
		    
		    if ( (i+1) % 13 == 11 )
		    {
          rank = "Jack";
        }
        else if ( (i+1) % 13 == 12 ) 
        {
          rank = "Queen";
        }
        else if ( (i+1) % 13 == 0 )
        {
          rank = "King";
        }
        else if ( (i+1) % 13 == 1 )
        {
          rank = "Ace";
        }
            
        if (i < 13)
        {
          suit = "Hearts";
        }
          else if (i < 26) 
        {
          suit = "Diamonds";
        }
	  }
  }
}
