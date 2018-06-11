
import java.util.Scanner;

public class stringOps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// System.out.println(palindrome(str));
		System.out.println(allSubstring(str));
		//reverseString(str);

	}

	public static boolean palindrome(String str) {
		int l = str.length() - 1;
		String str1 = "";
		for (int i = l; i >= 0; i--) {
			str1 += str.charAt(i);
		}

		if (str.equals(str1) == true)
			return true;
		else
			return false;

	}

	public static int allSubstring(String str) {
		int l = str.length(), count= 0;;
		String str1 = "";
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j <= l; j++) {
				str1 = str.substring(i, j);
				boolean ans = palindrome(str1);
				if (ans == true)
					count++;

			}

		}
		return count;
	}

	/*
	 * public static void reverseString(String str) { int l = str.length(), i = l -
	 * 1; String str1 = ""; while (i >= 0) { while (str.charAt(i) != ' ') { str1 =
	 * str.charAt(i) + str1; i--; }
	 * 
	 * 
	 * } }
	 */
}
