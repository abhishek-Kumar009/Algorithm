import java.util.*;
public class armstrong {
static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) {
		int ll= sc.nextInt();
		int ul= sc.nextInt();
		
		printAllArmstrong(ll, ul);

	}

	public static void printAllArmstrong(int ll, int ul) {
		for (int i = ll; i <= ul; i++) {
			int digits = numberOfDigits(i);
			boolean ans = isArmstrong(i, digits);
			if (ans) {
				System.out.println(i);
			}
		}

	}

	public static boolean isArmstrong(int num, int nod) {
		int sum = 0,rnum= num;
		while (rnum > 0) {
			int r = rnum % 10;
			rnum = rnum / 10;
			sum = (int) (sum + Math.pow(r, nod));
		}
		if (sum == num)
			return true;
		else
			return false;
	}

	public static int numberOfDigits(int num) {
		int count = 0;
		while (num > 0) {

			num = num / 10;
			count++;
		}
		return count;

	}

}
