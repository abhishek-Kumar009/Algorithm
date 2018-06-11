package lecture9;

import java.util.Scanner;

public class solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc = new Scanner(System.in);
		//String str = sc.nextLine();
		boardPath(1 , 10 , "" , 0);
		//int i, l = str.length();
		//int[] arr = new int[l];
		
		//for (i = 0; i < arr.length; i++)
		//	arr[i] = sc.nextInt();
		//System.out.println(shiftingLetters(str, arr));

	}

	public static String shiftingLetters(String S, int[] shifts) {
		char ch = ' ';
		StringBuilder sb = new StringBuilder(S);
		for (int i = 0; i < S.length(); i++) {
			for (int j = 0; j <= i; j++) {
				int val = ((int) sb.charAt(j) + shifts[i]);
				if (val > 122) {
					while(val >122) {
					val = 96 + (val - 122);
					}
					ch = (char) val;
					System.out.println(j +" : " +ch);
					sb.setCharAt(j, ch);
				} else {
					ch = (char)(val);
					System.out.println(ch);
					sb.setCharAt(j, ch);
				}
			}
		}
		return sb.toString();

	}
	public static void boardPath(int curr , int end , String ans , int count) {
		if(curr == end) {
			count++;
			return;
		}
		if(curr > end) {
			return;
		}
		for(int i = 1; i <= 6; i++) {
			boardPath(curr + i , end , ans + i , count);
		}
		System.out.println(count);
	}
}
