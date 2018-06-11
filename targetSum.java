import java.util.Scanner;

public class targetSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i, tar;
		int[] arr = new int[n];
		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		tar = sc.nextInt();
		sumTarget(tar, n, arr);

	}

	public static int sumTarget(int tar, int n, int[] arr) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] + arr[j] == tar)
					System.out.println(arr[i] + " and " + arr[j]);
			}
		}
		return 0;
	}

}
