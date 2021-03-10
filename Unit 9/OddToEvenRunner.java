//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song
//Date - 3/9/21

import java.util.*;
public class OddToEvenRunner
{
	public static void main( String args[] )
	{
    		Integer[] array = {7,1,5,3,11,5,6,7,8,9,10,12345,11};
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(array));
		System.out.println(ListOddToEven.distance(arr));
		
		Integer[] array1 = {11,9,8,7,6,5,4,3,2,1,-99,7};
		arr = new ArrayList<Integer>(Arrays.asList(array1));
		System.out.println(ListOddToEven.distance(arr));
		
		Integer[] array2 = {10,20,30,40,5,41,31,20,11,7};
		arr = new ArrayList<Integer>(Arrays.asList(array2));
		System.out.println(ListOddToEven.distance(arr));
		
		Integer[] array3= {32767,70,4,5,6,7};
		arr = new ArrayList<Integer>(Arrays.asList(array3));
		System.out.println(ListOddToEven.distance(arr));
		
		Integer[] array4 = {2,7,11,21,5,7};
		arr = new ArrayList<Integer>(Arrays.asList(array4));
		System.out.println(ListOddToEven.distance(arr));
		
		Integer[] array5 = {7,255,11,255,100,3,2};
		arr = new ArrayList<Integer>(Arrays.asList(array5));
		System.out.println(ListOddToEven.distance(arr));
		
		Integer[] array6 = {9,11,11,11,7,1000,3};
		arr = new ArrayList<Integer>(Arrays.asList(array6));
		System.out.println(ListOddToEven.distance(arr));
		
		Integer[] array7 = {7,7,7,11,2,7,7,11,11,2};
		arr = new ArrayList<Integer>(Arrays.asList(array7));
		System.out.println(ListOddToEven.distance(arr));
		
		Integer[] array8 = {2,4,6,8,8};
		arr = new ArrayList<Integer>(Arrays.asList(array8));
		System.out.println(ListOddToEven.distance(arr));
	}
}
