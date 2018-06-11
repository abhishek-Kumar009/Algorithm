import java.util.*;

public class gameSmartPhone {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int M = sc.nextInt();
		int N = sc.nextInt();
		game(T, M, N);

	}

	public static void game(int T, int M, int N) {
		for (int i = 1; i <= T; i++) {
			int sum1 = 0, sum2 = 0, count = 1, val1 = 1, val2 = 2;
			while (true) {
				if (count == 1) {
					val1 = 1;
					val2 = 2;
					count++;
				} else if (sum1 > M) {
					System.out.println("Harshit");
					break;
				} else if (sum2 > N) {
					System.out.println("Aayush");
					break;
				}

				sum1 += (val1);
				sum2 += (val2);
				val1 += 2;
				val2 += 2;

			}
		}
	}
}