
public class Q2 {

	public static void main(String[] args) {

		int[] arr = { 44, 12, 1, 65, 9, 2, 88, 100, 33 };

		int l = arr.length;

		int temp = 0;

		for (int i = 0; i < l; i++) {
			
			for (int j = 1; j < (l-i); j++) {
				
				if (arr[j-1] > arr[j]) {
				
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					
				}

			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
