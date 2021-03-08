//CSA - Period 3
//Name - Justin Song
public class Card {

  private String rank;
	private String suit;
	private int pointValue;

  //a constructor that takes two String parameters that represent the card’s rank and suit, and an int parameter that represents the point value of the card
	public Card(String cardRank, String cardSuit, int cardPointValue) 
  {
    rank = cardRank;
    suit = cardSuit;
    pointValue = cardPointValue;
	}

  //accessor methods for the card’s rank, suit, and point value
	public String suit() 
  {
		return suit;
  }
	public String rank() 
  {
		return rank;
	}
	public int pointValue() 
  {
		return pointValue;
	}

	//a method to test equality between two card objects
	public boolean matches(Card otherCard) 
  {
		if (otherCard.rank().equals(this.rank()) && otherCard.suit().equals(this.suit()) && otherCard.pointValue == this.pointValue())
    {
      return true;
    }
    else
    {
      return false;
    }
	}

	@Override
  //the toString method to create a String that contains the rank, suit,and point value of the card object.
	public String toString() 
  {
		return rank + " of " + suit + " (point value = " + pointValue + ")";
	}
}
