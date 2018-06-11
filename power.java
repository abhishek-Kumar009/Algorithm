
public class power {

	public static void main(String[] args) {

		System.out.println(calcPower(3, 5));

	}

	public static int calcPower(int x, int n) {
		if (n == 0) {
			return 1;
		}
		int pw = calcPower(x, n - 1);
		int pn = x * pw;
		return pn;

	}

}
