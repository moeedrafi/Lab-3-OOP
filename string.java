import java.util.Scanner;
public class string {
	public static void main(String[] args) {
		Scanner abc = new Scanner(System.in);
		String m, n;
		System.out.println("Enter First String:");
		m = abc.nextLine();
		System.out.println("Enter Second String:");
		n = abc.nextLine();
		Length(m, n);
		
		
	}
   static void Length(String i, String j) {
	   int s1 = i.length();
	   int s2 = j.length();
	   if(s1 > s2) {
		   System.out.println("Longest String is: " + i );
	   }
	   else
	       System.out.println("Longest String is: " + j );
   }
}