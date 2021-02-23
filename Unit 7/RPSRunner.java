//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Justin Song

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
	public static void main(String args[])
	{
		playagain();
	}
  public static void playagain()
  {
    Scanner keyboard = new Scanner(System.in);
		char response;
		
			String player = "";
		
			out.print("type in your prompt [R,P,S] :: ");
		
			RockPaperScissors game = new RockPaperScissors(keyboard.nextLine());
      System.out.println(game);

      System.out.print("\nDo you want to play again? (y/n) :: ");
      if (keyboard.nextLine().equals("y"))
      {
        playagain();
      }
  }
}



