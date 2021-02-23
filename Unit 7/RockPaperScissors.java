//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Justin Song 

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
	private String playChoice;
	private String compChoice;

	public RockPaperScissors()
	{
    playChoice = "";
    compChoice = "";
	}

	public RockPaperScissors(String player)
	{
    playChoice = player;
	}

	public void setPlayers(String player)
	{
    playChoice = player;
	}

	public String determineWinner()
	{
		String winner="";
    int number = (int)Math.random()*3;

    if (number == 0)
    {
      compChoice = "R";
    }
    if (number == 1)
    {
      compChoice = "P";
    }
    else
    {
      compChoice = "S";
    }

    if (playChoice.equals(compChoice))
    {
      winner = "!Draw game!";
    }
    else if (playChoice.equals("R") && number == 1)
    {
      winner = "!Computer wins <<Paper Covers Rock>>!";
    }
    else if (playChoice.equals("P") && number == 2)
    {
      winner = "!Computer wins <<Scissors Cuts Paper>>!";
    }
    else if (playChoice.equals("S") && number == 0)
    {
      winner = "!Computer wins <<Rock Breaks Scissors>>!";
    }
    else if (playChoice.equals("R") && number == 2)
    {
      winner = "!Player wins <<Rock Breaks Scissors>>!";
    }
    else if (playChoice.equals("P") && number == 0)
    {
      winner = "!Player wins <<Paper Covers Rock>>!";
    }
    else
    {
      winner = "!Player wins <<Scissors Cuts Paper>>!";
    }
		return winner;
	}

	public String toString()
	{
    String winner = determineWinner();
		String output="player had " + playChoice + "\ncomputer had " + compChoice + "\n" + winner;
		return output;
	}
}