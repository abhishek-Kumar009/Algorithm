import java.util.Scanner;

public class inverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int digits = noOfDigits(n);
		int[] arr = new int[digits + 1];
		int face = 1;
		while (n > 0) {
			int r = n % 10;
			n = n / 10;
			arr[r] = face;
			face++;

		}
		for (int i = n; i >= 1; i++)
			System.out.print(arr[i]);

	}

	public static int noOfDigits(int n) {
		int count = 0;
		while (n > 0) {
			
			n = n / 10;
			count++;
		}
		return count;
	}

}
