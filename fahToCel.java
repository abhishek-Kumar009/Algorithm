import java.util.Scanner;

public class fahToCel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i, cas = 20;
		int max = sc.nextInt();
		for (i = 0; i <= max; i += cas) {
			int cel = (5 * (i - 32)) / 9;
			System.out.println(i + "\t" + cel);

		}

	}

}
