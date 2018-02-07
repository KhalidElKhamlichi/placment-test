import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		
		String reversed = new StringBuilder(word).reverse().toString();
		
		System.out.println(reversed);

	}

}
