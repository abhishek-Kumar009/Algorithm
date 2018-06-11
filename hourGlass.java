import java.util.Scanner;

public class hourGlass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = 1, col = 0, csp = 0, nsp = 0, rn = n, count = 0, count1= 0,count2=0,count3=0;
		outer: while (row <= n + n - 1) {
			System.out.println();
			csp = 0;
			while (csp < nsp) {
				System.out.print(" ");
				csp++;
			}
			if(rn == 1 && count1 == 0 && count3 == 1) {
				System.out.print("  "+0);
				count1++;
				continue outer;
			}
			

			col = rn;
			while (col >= 1) {
				System.out.print(col+" ");
				col--;
			}

			System.out.print(0+" ");

			col = 1;
			while (col <= rn) {
				System.out.print(col+" ");
				col++;

			}
			if (row < n) {
				nsp = nsp + 2;
				rn = rn - 1;

			} else {
				if(count2 == 0) {
					count3++;
					count2++;
				}
				
				if (rn == 1 && count == 0) {
					rn = 1;
					count++;
					row--;
				} else {
					nsp= nsp - 2;
					rn = rn + 1;
				}
			}

			row++;

		}
	}
}
