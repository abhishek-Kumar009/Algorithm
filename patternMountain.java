import java.util.Scanner;

public class patternMountain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1, cst = 1, nst = 1, csp = 0, csta = 0,nsp= (n - 1)*2 - 1;
		
		while (row <= n) {
			System.out.println();
			cst = 1;
			while (cst <= nst) {
				System.out.print(cst+"\t");
				cst++;
			}
			csp = 0;
			while (csp < nsp) {
				System.out.print(" "+"\t");
				csp++;
			}
			if (row != n)
				csta = row;
			else
				csta = row - 1;
			while (csta >= 1) {
				System.out.print(csta+"\t");
				csta--;
			}
			row++;
			nst = nst + 1;
			nsp = nsp - 2;

		}

	}

}
