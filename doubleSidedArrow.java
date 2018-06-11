import java.util.Scanner;

public class doubleSidedArrow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1, col = 1, csp = 0, nsp = n - 1, nspa = 1;
		while (row <= n) {
			System.out.println();
			if (row == 1 || row == n) {
				csp = 0;
				while (csp <= n ) {
					System.out.print(" ");
					csp++;
				}
				System.out.print(1); 
			} else {
				csp = 0;
				while (csp < nsp) {
					System.out.print(" ");
					csp++;
				}
				col = row;
				while (col >= 1) {
					System.out.print(col);
					col--;
				}
				csp = 0;
				while (csp < nspa) {
					System.out.print(" ");
					csp++;
				}
				col = 1;
				while (col <= row) {
					System.out.print(col);
					col++;
				}
				if (row <= n / 2) {
					nsp = nsp - 1;
					nspa = nspa + 1;
				} else {
					nsp = nsp + 1;
					nspa = nspa - 1;
				}
				

			}
			row++;

		}

	}
}
