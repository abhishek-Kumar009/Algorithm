import java.util.Scanner;

public class hollowDiamond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1, cst = 1, nst = n / 2, csp = 1, nsp = 1;
		while (row <= n) {

			System.out.println();
			if (row == 1 || row == n) {
				cst=1;
				while (cst <= n) {
					System.out.print("*");
					cst++;
				}
				row++;
			} else {
				cst = 1;
				while (cst <= nst) {
					System.out.print("*");
					cst++;
				}
				csp = 1;
				while (csp <= nsp) {
					System.out.print(" ");
					csp++;
				}
				cst = 1;
				while (cst <= nst) {
					System.out.print("*");
					cst++;
				}
				if (row <=n / 2) {
					nst = nst - 1;
					nsp = nsp + 2;
				} else {
					nst = nst + 1;
					nsp = nsp - 2;
				}
				row++;

			}

		}

	}
}
