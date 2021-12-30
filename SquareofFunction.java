import java.util.Scanner;
public class SquareofFunction {

	public static void main(String[] args) {
		int n;
		Scanner input = new Scanner (System.in);
		System.out.println("Enter a number:");
		n = input.nextInt();
		square(n);
	}
	public static void square(int a) {
		System.out.println("Square of number is: "+a*a);
	}
}