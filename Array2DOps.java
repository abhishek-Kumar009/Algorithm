
import java.util.*;

public class Array2DOps {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Rows ?");
		int row = sc.nextInt();
		System.out.println("Col ?");
		int col = sc.nextInt();

		int[][] array = new int[row][col];
		takeInput(array);
		// display(array);
		//verticalDisplay(array);
		waveDisplay(array);

	}

	public static int[][] takeInput(int[][] array) {
		for (int rows = 0; rows < array.length; rows++) {

			for (int col = 0; col < array[0].length; col++) {
				System.out.println("Row[" + rows + "," + col + "]");
				array[rows][col] = sc.nextInt();
			}
		}
		return array;

	}

	public static void display(int[][] array) {
		for (int row = 0; row < array.length; row++) {
			System.out.println();
			for (int col = 0; col < array[0].length; col++) {
				System.out.print(array[row][col] + " ");
			}
		}
	}

	public static void verticalDisplay(int[][] array) {
		for (int col = 0; col < array[0].length; col++) {

			for (int row = 0; row < array.length; row++)
				System.out.print(array[row][col] + ", ");
		}
	}

	public static void waveDisplay(int[][] array) {
		int row, col;
		for( col= 0; col < array[0].length; col++) {
			if(col % 2 == 0) {
			for( row= 0; row < array.length; row++) 
				System.out.print(array[row][col]+",");
			}else {
			for(row= array.length - 1; row >=0; row--)
				System.out.print(array[row][col]+",  ");
			}
		}
	}
	/*public static void spiralDisplay(int[][] array) {
		int count= 0;
		for(int col= 0; col < array[0].length; col++) {
			for(int row= 0; row < array.length; row++) {
				System.out.print(array[row][col]);
				count++;
			}
			for(int i=0; i< array[0].length;i++)
				System.out.println();
			
			
				
			
		}*/
	}


