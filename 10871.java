import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int arr[] = new int[a];

		for (int i = 0; i < a; i++) {
			arr[i] = scan.nextInt();
		}

		for (int i = 0; i < a; i++) {
			if (arr[i] < b) {
				System.out.printf(arr[i] + " ");
			}
		}
	}

}