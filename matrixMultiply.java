import java.util.Scanner;

public class matrixMultiply {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int[][] arr1= {{1,2,3},{4,5,6}};
		int[][] arr2= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int[][] array= matrixMultiplication(arr1, arr2);
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2)
		}
	}
	public static int[][] matrixMultiplication(int [][] one, int[][] two){
		int r1= one.length;
		
		int r2= two.length;
		int c2= two[0].length;
		if( r1 != c2)
			return null;
		int k,cd= c2, sum= 0;
		int[][] ans= new int[r1][c2];
		for(int row= 0; row < r1; row++) {
			
			for(int col= 0; col < r2; col++ ) {
				
				for( k= 0;k < cd; k++) {
					sum= sum + one[row][k]*two[k][col];
				}
			}
		}
		return ans;
	}

}
