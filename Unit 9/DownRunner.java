//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song
//Date -  3/9/21


import java.util.*;
public class DownRunner
{
	public static void main( String args[] )
	{				
    Integer[] array = {-99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12345};
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(array));
		System.out.println(ListDown.go(arr));
		
		Integer[] array1 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1, -99};
		arr = new ArrayList<Integer>(Arrays.asList(array1));
		System.out.println(ListDown.go(arr));
		
		Integer[] array2 = {10, 20, 30, 40, 50, -11818, 40, 30, 20, 10};
		arr = new ArrayList<Integer>(Arrays.asList(array2));
		System.out.println(ListDown.go(arr));
		
		Integer[] array3 = {32767};
		arr = new ArrayList<Integer>(Arrays.asList(array3));
		System.out.println(ListDown.go(arr));
		
		Integer[] array4 = {255, 255};
		arr = new ArrayList<Integer>(Arrays.asList(array4));
		System.out.println(ListDown.go(arr));
		
		Integer[] array5 = {9, 10, -88, 100, -555, 1000};
		arr = new ArrayList<Integer>(Arrays.asList(array5));
		System.out.println(ListDown.go(arr));
		
		Integer[] array6 = {10, 10, 10, 11, 456};
		arr = new ArrayList<Integer>(Arrays.asList(array6));
		System.out.println(ListDown.go(arr));
		
		Integer[] array7 = {-111, 1, 2, 3, 9, 11, 20, 30};
		arr = new ArrayList<Integer>(Arrays.asList(array7));
		System.out.println(ListDown.go(arr));
		
		Integer[] array8 = {9, 8, 7, 6, 5, 4, 3, 2, 0, -2, -989};
		arr = new ArrayList<Integer>(Arrays.asList(array8));
		System.out.println(ListDown.go(arr));
		
		Integer[] array9= {12, 15, 18, 21, 23, 1000};
		arr = new ArrayList<Integer>(Arrays.asList(array9));
		System.out.println(ListDown.go(arr));
		
		Integer[] array10 = {250, 19, 17, 15, 13, 11, 10, 9, 6, 3, 2, 1, -455};
		arr = new ArrayList<Integer>(Arrays.asList(array10));
		System.out.println(ListDown.go(arr));
		
		Integer[] array11 = {9, 10, -8, 10000, -5000, 1000};
		arr = new ArrayList<Integer>(Arrays.asList(array11));
		System.out.println(ListDown.go(arr));							
	}
}