import java.util.Scanner;

public class charIdent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.nextLine().charAt(0);
		if (ch >= 'A' && ch <= 'Z')
			System.out.println("Uppercase");
		else if (ch >= 'a' && ch <= 'z')
			System.out.println("Lowercase");
		else
			System.out.println("Invalid Input");

	}

}
