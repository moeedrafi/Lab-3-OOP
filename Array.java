import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a;
		System.out.println("Enter the size of array: ");
		a = s.nextInt();
		
		int[] array = new int [a];
		System.out.println("Enter elements: ");
		for(int i = 0; i < a; i++) 
		{
			
		    array[i] = s.nextInt();
		}
	    function(array, a);
   }
	public static void function(int[] c,int d) {
		System.out.println("Array Elements are: ");
		for(int loop = 0; loop < d ;loop++) 
		{
		    System.out.println(c[loop] + "");
		}
	}
}