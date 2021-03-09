//CSA - Period 3
//Name - Justin Song
public class DeckTester {
    public static void main(String[] args) 
    {
        String[] ranks = {"4", "8", "Queen"};
        String[] suits = {"Hearts", "Spades", "Diamonds"};
        int[] pointValues = {4, 8, 12};
        Deck d = new Deck(ranks, suits, pointValues);
        
        //a basic set of Deck tests.
        System.out.println("Initial Deck Methods:");
        System.out.println("toString:\n" + d.toString());
        System.out.println("isEmpty: " + d.isEmpty());
        System.out.println("size: " + d.length());
        System.out.println();
        

        System.out.println("Deal a card:");
        System.out.println("deal: " + d.deal());
        System.out.println();
       

        System.out.println("Deck Methods After 1 Card Dealt:");
        System.out.println("toString:\n" + d.toString());
        System.out.println("isEmpty: " + d.isEmpty());
        System.out.println("size: " + d.length());
        System.out.println();
      

        System.out.println("Deal 5 cards remaining:");
        for (int i = 0; i < 5; i++) {
            System.out.println("deal: " + d.deal());
        }
        System.out.println();
       

        System.out.println("Final Deck Methods:");
        System.out.println("toString:\n" + d.toString());
        System.out.println("isEmpty: " + d.isEmpty());
        System.out.println("size: " + d.length());
        System.out.println();
       

        System.out.println("Deal a Card From Empty Deck:");
        System.out.println("deal: " + d.deal());
        System.out.println();
      

        System.out.println("Shuffle");

        //Add additional code at the bottom of the main method to create a standard deck of 52 cards and test the shuffle method.
        String[] ranks1 = new String[52];
        String[] suits1 = new String[52];
        int[] pointValues1 = new int[52];

        for (int i = 0; i < 52; i++) 
        {
            String rank = "";
            String suit = "";

            if ((i + 1) % 13 == 11) 
            {
                rank = "Jack";
            } 
            else if ((i + 1) % 13 == 12) 
            {
                rank = "Queen";
            } 
            else if ((i + 1) % 13 == 0) 
            {
                rank = "King";
            } 
            else if ((i + 1) % 13 == 1) 
            {
                rank = "Ace";
            } 
            else 
            {
                rank = Integer.toString((i+1) % 13);
            }

            if (i < 13) 
            {
                suit = "Hearts";
            } 
            else if (i < 26) 
            {
                suit = "Diamonds";
            } 
            else if (i < 39) 
            {
                suit = "Clubs";
            } 
            else 
            {
                suit = "Spades";
            }

            ranks1[i] = rank;
            suits1[i] = suit;
            pointValues1[i] = ((i + 1) % 13);
        }

        Deck n = new Deck(ranks1, suits1, pointValues1);
        n.shuffle();
        System.out.println(n);
    }
}
