//CSA - Period 3
//Name - Justin Song
import java.util.List;
import java.util.ArrayList;

public class Deck 
{
    private Card[] cards;
    private int size;

    //Deck constructor
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

    //This method should return true when the size of the deck is 0; false otherwise.
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

    //This method returns the number of cards in the deck that are left to be dealt.
    public int length() 
    {
        return size;
    }

    //Complete the Deck class by implementing the shuffle method.
    public void shuffle() 
    {
        for (int k = size - 1; k >= 0; k--) 
        {
            int rand = (int) (Math.random() * k);
            Card t = cards[rand];
            cards[rand] = cards[k];
            cards[k] = t;
        }
    }

    //This method “deals” a card by removing a card from the deck and returning it, if there are any cards in the deck left to be dealt. It returns null if the deck is empty.
    public Card deal()
     {
        if (size > 0) 
        {
            size = size - 1;
            return cards[size];
        }
        return null;
    }

    @Override
    public String toString()
     {
        String rtn = "size = " + size + "\nUndealt cards: \n";

        for (int k = size - 1; k >= 0; k--)
        {
            rtn = rtn + cards[k];
            if (k != 0) 
            {
                rtn = rtn + ", ";
            }
            if ((size - k) % 2 == 0) 
            {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\nDealt cards: \n";
        for (int k = cards.length - 1; k >= size; k--)
         {
            rtn = rtn + cards[k];
            if (k != size) 
            {
                rtn = rtn + ", ";
            }
            if ((k - cards.length) % 2 == 0)
            {
                // Insert carriage returns so entire deck is visible on console.
                rtn = rtn + "\n";
            }
        }

        rtn = rtn + "\n";
        return rtn;
    }
}
