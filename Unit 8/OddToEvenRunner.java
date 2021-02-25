//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Justin Song
//Date - 2/23/21

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		int[] array = {7,1,5,3,11,5,6,7,8,9,10,12345,11};
		System.out.println(RayOddToEven.checker(array));
		
		int[] array1 = {11,9,8,7,6,5,4,3,2,1,-99,7};
		System.out.println(RayOddToEven.checker(array1));
		
		int[] array2 = {10,20,30,40,5,41,31,20,11,7};
		System.out.println(RayOddToEven.checker(array2));
		
		int[] array3= {32767,70,4,5,6,7};
		System.out.println(RayOddToEven.checker(array3));
		
		int[] array4 = {2,7,11,21,5,7};
		System.out.println(RayOddToEven.checker(array4));
		
		int[] array5 = {7,255,11,255,100,3,2};
		System.out.println(RayOddToEven.checker(array5));
		
		int[] array6 = {9,11,11,11,7,1000,3};
		System.out.println(RayOddToEven.checker(array6));
		
		int[] array7 = {7,7,7,11,2,7,7,11,11,2};
		System.out.println(RayOddToEven.checker(array7));
		
		int[] array8 = {2,4,6,8,8};
		System.out.println(RayOddToEven.checker(array8));
	}
}

