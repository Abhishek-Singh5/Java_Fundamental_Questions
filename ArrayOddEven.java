import java.util.*;
class Main {
	public static void main(String [] s) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the Size of Array ");
		int n = s1.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter the Element of Array ");
		for(int i = 0; i < n; i++) {
			arr[i] = s1.nextInt();
		}
		System.out.println("Printing Array ");
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int countEven = 0;
		int countOdd = 0;

		for(int i = 0; i < n; i++) {
			if(arr[i] % 2 == 0)
				countEven++;
			else
				countOdd++;
		}

		System.out.println("Even Element in Array ");
		if(countEven > 0) {
			for(int i = 0; i < n; i++) {
				if(arr[i] % 2 == 0) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
		}

		System.out.println("Odd Element in Array ");
		if(countEven > 0) {
			for(int i = 0; i < n; i++) {
				if(arr[i] % 2 == 1) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
		}
	}
}

