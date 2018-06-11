import java.util.Scanner;

public class patternTriangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1, csp = 0, nsp = n - 1,cst=1,nst=1,count=1;
		while (row <= n) {
			System.out.println();
			csp = 0;
			while (csp < nsp) {
				System.out.print(" ");
				csp++;
			}
			cst=1;
			while(cst<=nst) {
				while(count<=nst) {
					System.out.print(count);
					count++;
				}
				cst++;
			
			}
			row++;
			nsp= nsp - 1;
			nst= nst+ 2;
		}

	}

}
