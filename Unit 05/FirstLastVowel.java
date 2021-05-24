//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song
//Date - 2/9/21


public class FirstLastVowel
{
   public static String go( String a )
  {
    if (a.substring(0,1).equals("a") || a.substring(0,1).equals("A") ||    a.substring(0,1).equals("e") || a.substring(0,1).equals("E") ||    a.substring(0,1).equals("i") || a.substring(0,1).equals("I") ||
        a.substring(0,1).equals("o") || a.substring(0,1).equals("O") ||a.substring(0,1).equals("u") || a.substring(0,1).equals("U") ||a.substring(a.length()-1).equals("a") || a.substring(a.length()-1).equals("A") || a.substring(a.length()-1).equals("e") || a.substring(a.length()-1).equals("E") || a.substring(a.length()-1).equals("i") || a.substring(a.length()-1).equals("I") ||
        a.substring(a.length()-1).equals("o") || a.substring(a.length()-1).equals("O") ||a.substring(a.length()-1).equals("u") || a.substring(a.length()-1).equals("U")) 
    {
      return "yes";
    }
    else
    {
      return "no";
    }
  }
}
