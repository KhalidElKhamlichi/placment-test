import java.util.Arrays;
import java.util.List;

public class Q4 {

	public static void main(String[] args) {
		final List<Integer> xCoordinates = Arrays.asList(2, 4, 5, 6);
		final List<Integer> oCoordinates = Arrays.asList(0, 1, 3, 8);
		
		int length = xCoordinates.size() + oCoordinates.size() + 1;
		
		for (int i = 0; i < length; i++) {
			if(xCoordinates.contains(new Integer(i)))
				System.out.print("X");
			else if(oCoordinates.contains(new Integer(i)))
				System.out.print("O");
			else
				System.out.print(" ");
			
			if((i+1)%3 == 0)
				System.out.println();
		}
	
		
		
	}

}
