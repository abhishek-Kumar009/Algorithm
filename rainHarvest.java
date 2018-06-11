import java.util.Scanner;

public class rainHarvest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int k = 1; k <= T; k++) {
			int i, j, water = 0;

			int n = sc.nextInt();
			int[] arr = new int[n];
			for (i = 0; i < arr.length; i++)
				arr[i] = sc.nextInt();
			for (i = 0; i < arr.length; i++) {
				int lmax = 0, rmax = 0, min = 0;
				j = i;
				lmax = arr[i];

				while (j != 0) {
					if (arr[j - 1] > lmax)
						lmax = arr[j - 1];
					j--;
				}
				j = i;
				rmax = arr[i];
				while (j < arr.length && j != arr.length - 1) {
					if (arr[j + 1] > rmax)
						rmax = arr[j + 1];
					j++;
				}
				min = (lmax < rmax) ? lmax : rmax;
				water += (min - arr[i]);

			}
			System.out.println(water);

		}

	}

}
