import java.util.Scanner;

public class countNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int num= sc.nextInt();
		int r,count=0;
		while(n != 0) {
			r= n%10;
			if(r == num)
				count++;
			n=n/10;
		}
		System.out.println();

	}

}
