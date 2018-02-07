import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String word = sc.nextLine();
		
		StringBuilder reversed = new StringBuilder();
		
		for (int i = word.length()-1; i >= 0; i--) {
			reversed.append(String.valueOf(word.charAt(i)));
		}
		
		System.out.println(reversed);

	}

}
