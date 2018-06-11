package lecture7;

//import java.util.ArrayList;
import java.util.Scanner;

public class recursionPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// int[] arr = { 20, 10, 40, 10, 20, 50, 20, 20 };
		// System.out.println(maximum(arr, 0));

		// System.out.println(allIndex(arr , 0, 20 ,0));
		// System.out.println(getAllSS("abc"));
		// System.out.println(nTriangle(4));
		/*
		 * int n = sc.nextInt(); int[] arr = new int[n]; for (int i = 0; i < arr.length;
		 * i++) arr[i] = sc.nextInt();
		 */

		// System.out.println(isArraySorted(arr , 0));
		// int item = sc.nextInt();
		// System.out.println(isNumberPresent(arr, item, 0));
		// System.out.println(findFirst(arr, 0, item));
		// System.out.println(findLast(arr, 0, item));
		// int array[] = returnIndex(arr, 0, item, 0);
		// for (int val : array)
		// System.out.print(val + " ");
		String str = sc.nextLine();
		// int l = str.length() - 1;
		// System.out.println(isPalindrome(str , 0 , l));
		String s1 = changeString(str, 0);
		System.out.println(s1);
	}

	public static String changeString(String str, int i) {
		StringBuilder sb = new StringBuilder(str);
		if (i == str.length()) {

			return str;
		}

		String str1 = changeString(str, i + 1);
		if (i > 0 &&(str1.charAt(i - 1) == str1.charAt(i))) {
			sb.insert(i , '*');
			i = i - 1;
			System.out.println(sb);
			 return sb.toString();
		}
		return str1;
		

	}
	/*
	 * public static boolean isPalindrome(String str , int i , int l) {
	 * StringBuilder sb = new StringBuilder(str); if(i >= l) { return true; }
	 * if(sb.charAt(i) != sb.charAt(l)) { return false; } return isPalindrome(str ,
	 * i + 1 , l - 1);
	 * 
	 * }
	 */

	/*
	 * public static int[] returnIndex(int[] arr, int i, int item, int count) { if
	 * (i == arr.length) { int[] arr1 = new int[count]; return arr1;
	 * 
	 * } if (arr[i] == item) { count++; } int array[] = returnIndex(arr, i + 1,
	 * item, count);
	 * 
	 * if (arr[i] == item) { array[count - 1] = i; count--;
	 * 
	 * } return array; }
	 */
	/*
	 * 
	 * public static boolean isNumberPresent(int[] arr, int item, int i) { if (i ==
	 * arr.length - 1) return false; if (arr[i] == item) { return true; } return
	 * isNumberPresent(arr, item, ++i); }
	 */
	/*
	 * public static boolean isArraySorted(int[] arr, int i) { if(i == arr.length -
	 * 1) { return true; } if(arr[i + 1] < arr[i]) { return false; } return
	 * isArraySorted(arr, ++i);
	 * 
	 * 
	 * }
	 */

	/*
	 * public static int nTriangle(int n) { if (n == 0) return 0;
	 * 
	 * return (nTriangle(n - 1) + n);
	 * 
	 * }
	 */

	/*
	 * public static int fibo(int n) { if (n == 0 || n == 1) { return n; } int fnm1
	 * = fibo(n - 1); int fnm2 = fibo(n - 2); int sum = fnm1 + fnm2; return sum;
	 * 
	 * }
	 * 
	 * public static int maximum(int[] arr, int vidx) { if (vidx == arr.length)
	 * return Integer.MIN_VALUE; int max = maximum(arr, vidx + 1); if (arr[vidx] >
	 * max) max = arr[vidx]; return max;
	 * 
	 * }
	 */
	/*
	 * public static int findFirst(int[] arr, int vidx, int item) {
	 * 
	 * if (vidx == arr.length) return -1;
	 * 
	 * if (arr[vidx] == item) { return vidx; } return findFirst(arr, vidx + 1,
	 * item);
	 * 
	 * }
	 */

	/*
	 * public static int findLast(int[] arr, int vidx, int item) { if (vidx ==
	 * arr.length) return -1; int rr = findLast(arr, vidx + 1, item);
	 * 
	 * if (arr[vidx] == item && rr == -1) return vidx; return rr;
	 * 
	 * }
	 */

	/*
	 * public static int[] allIndex(int[] arr , int vidx ,int item, int count) {
	 * if(vidx == arr.length) { int[] br= new int[count]; return br; }
	 * 
	 * if(arr[vidx] == item) { int rr[] = allIndex(arr , vidx + 1 , item ,count +
	 * 1); rr[count] = vidx; return rr; }else { int rr[] = allIndex(arr , vidx, item
	 * , count); return rr; } }
	 */

	/*
	 * public static ArrayList<String> getAllSS(String str) { if (str.length() == 0)
	 * { ArrayList<String> sd = new ArrayList<>(); sd.add(""); return sd;
	 * 
	 * } char ch = str.charAt(0); String ros = str.substring(1); ArrayList<String>
	 * rr = getAllSS(ros); ArrayList<String> list = new ArrayList<>(); for (String
	 * rrs : rr) { list.add((int) ch + rrs); list.add(rrs); list.add(ch + rrs);
	 * 
	 * } return list; }
	 */

}
