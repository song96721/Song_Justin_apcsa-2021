//CSA - Period 3
//Name - Justin Song
import java.util.List;
import java.util.ArrayList;

public class Deck 
{
	private Card[] cards;
	private int size;

	public Deck(String[] ranks, String[] suits, int[] values) 
  {
    cards = new Card[ranks.length];
		for (int i = 0; i < ranks.length; i++)
    {
      Card card = new Card(ranks[i], suits[i], values[i]);
      cards[i] = card;
    }
    size = cards.length;
	}

	public boolean isEmpty() 
  {
		if (cards.length == 0) 
    {
      return true;
    }
    else
    {
      return false;
	  }
  }
	public int length() 
  {
		return cards.length;
	}
	public void shuffle() 
  {
		for (int k = size - 1; k >= 0; k-- ) 
    {
      int rand = (int)(Math.random() * k);
      Card t = cards[rand];
      cards[rand] =  cards[k];
      cards[k] = t;
    }
	}
	public Card deal() 
  {
	  size = size - 1;
    if (size > 0) 
    {
      return cards[size];
    }
    return null;
	}

	@Override
	public String toString() {
		String rtn = "size = " + size + "\nUndealt cards: \n";

		for (int k = size - 1; k >= 0; k--) {
			rtn = rtn + cards[k];
			if (k != 0) {
				rtn = rtn + ", ";
			}
			if ((size - k) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\nDealt cards: \n";
		for (int k = cards.length - 1; k >= size; k--) {
			rtn = rtn + cards[k];
			if (k != size) {
				rtn = rtn + ", ";
			}
			if ((k - cards.length) % 2 == 0) {
				// Insert carriage returns so entire deck is visible on console.
				rtn = rtn + "\n";
			}
		}

		rtn = rtn + "\n";
		return rtn;
	}
}
