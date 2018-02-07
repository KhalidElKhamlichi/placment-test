import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String number = sc.nextLine();
		
		String reversed = new StringBuilder(number).reverse().toString();
		
		if(number.equals(reversed)) {
			System.out.println("The number is a palindrome");
		}
		else {
			System.out.println("The number is not a palindrome");
		}

	}

}
