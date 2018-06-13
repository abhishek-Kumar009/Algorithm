package stackImplement;

import java.util.Scanner;

public class validParenthesis {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int l = str.length();
		validParenthesisWork vpw = new validParenthesisWork(l);

		for (int i = 0; i < l; i++) {
			char ch = str.charAt(i);
			if (ch == '[' || ch == '{' || ch == '(')
				vpw.push(ch);
			else if (ch == ']' || ch == '}' || ch == ')') {
				if (vpw.isEmpty() || ch != counter(vpw.top()))
					System.out.println("false");

				else
					vpw.pop();

			}
		}
		if (vpw.isEmpty())
			System.out.println("true");

	}

	public static char counter(char ch) {
		if (ch == '(')
			return ')';
		if (ch == '{')
			return '}';
		if (ch == '[')
			return ']';
		return '0';
	}

}
