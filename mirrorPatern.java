import java.util.Scanner;
public class mirrorPatern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int csp=0,nsp=n-4,cst=1,nst=1,row=1;
		
		while(row<=n)
		{
			System.out.println();
			csp=0;
			while(csp<=nsp)
			{
				System.out.print(" ");
				csp++;
			}
			cst=1;
			while(cst<=nst)
			{
				System.out.print("*");
				cst++;
			}
			if(row<=n/2) {
				nst= nst + 2;
				nsp= nsp - 1;
			}else {
				nst= nst - 2;
				nsp= nsp + 1;
			}
			row++;
		}

	}

}
