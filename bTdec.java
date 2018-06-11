import java.util.Scanner;

public class bTdec {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int l= sc.nextInt();
		int k= sc.nextInt();
		int r,multi=1,ans=0,ans1=0;
		while(k>0) {
			r=k%10;
			k=k/10;
			ans= ans + r*multi;
			multi*=n;
		}
		multi=1;
		while(ans!=0) {
			r=ans%l;
			ans=ans/l;
			ans1= ans1 + r*multi;
			multi*=10;
			
		}
		System.out.println(ans1);

	}

}
