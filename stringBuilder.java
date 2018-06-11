import java.util.Scanner;

public class stringBuilder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// System.out.println(toggleCase(str));

		// System.out.println(stringChanger(str));
		// System.out.println(stringDifference(str));
		// String str1 = stringSort(str);
		// System.out.println(charFreq(str1));
		System.out.println(reduceString(str));

	}

	/*
	 * public static String toggleCase(String str) { StringBuilder sb = new
	 * StringBuilder(); for (int i = 0; i < str.length(); i++) { if
	 * (Character.isLowerCase(str.charAt(i)))
	 * sb.append(Character.toUpperCase(str.charAt(i)));
	 * 
	 * else sb.append(Character.toLowerCase(str.charAt(i)));
	 * 
	 * } return sb.toString();
	 * 
	 * }
	 */

	/*
	 * public static void largestNumber(String str) { for(int i= 0; i <
	 * str.length(); i++) { for(int j= i+1; j< str.length(); j++) { max=
	 * str.compareTo(str.charAt(i)+"",str.charAt(j)+""); } }
	 * 
	 * }
	 */
	/*
	 * public static String stringChanger(String str) { StringBuilder sb = new
	 * StringBuilder(str); int change; for (int i = 0; i < str.length(); i++) { if
	 * (i % 2 != 0) { change = ((int) sb.charAt(i)) - 1; sb.setCharAt(i, (char)
	 * change); } else { change = ((int) sb.charAt(i)) + 1; sb.setCharAt(i, (char)
	 * change);
	 * 
	 * }
	 * 
	 * } return sb.toString(); }
	 */

	/*
	 * public static String stringDifference(String str) { StringBuilder sb = new
	 * StringBuilder(str); int i, count= 0; for(i= 0; i < str.length(); i++)
	 * count++; int l=str.length() + (count - 1); for ( i = 0; i < l - 1; i += 2) {
	 * 
	 * 
	 * int dif = ((int)sb.charAt(i + 1) - (int)sb.charAt(i)); sb.insert(i + 1, dif);
	 * 
	 * } return sb.toString(); } public static String freqCount(String str) {
	 * for(int i= 0; i < str.length(); i++) { for(int j= i + 1; j < str.length();
	 * j++) {
	 * 
	 * } } }
	 */
	/*
	 * public static String stringSort(String str) { StringBuilder sb = new
	 * StringBuilder(str); for (int i = 0; i < str.length() - 1; i++) { for (int j =
	 * 0; j < str.length() - 1 - i; j++) { if (sb.charAt(j) > sb.charAt(j + 1)) {
	 * char temp = sb.charAt(j + 1); sb.setCharAt(j + 1, sb.charAt(j));
	 * sb.setCharAt(j, temp);
	 * 
	 * } }
	 * 
	 * } return sb.toString(); }
	 */

	/*
	 * public static char charFreq(String str) { int frq = 0, max = frq; char ch= '
	 * '; for (int i = 0; i < str.length();) { frq = 0; int j = i; while (j !=
	 * str.length() &&str.charAt(j) == str.charAt(i)) { frq++; j++; }
	 * 
	 * if (frq > max) { ch= str.charAt(i); max = frq; } i = j; } return ch;
	 * 
	 * }
	 */
	public static String reduceString(String str) {
		StringBuilder sb = new StringBuilder(str);
		int count = 0;
		for (int i = 0; i < str.length() - count; i++) {
			int j = i + 1;
			while (j != (str.length() - count)) {
				if (str.charAt(j) == str.charAt(i)) {
					sb.deleteCharAt(j);
					count++;
					j--;
				}

				j++;

			}
		}
		return sb.toString();

	}
}
