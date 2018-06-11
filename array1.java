import java.util.Scanner;

public class array1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		int[] array = takeinput();
		int m= sc.nextInt();
		System.out.println(linearSearch(array, m));
		
		 // display(array); 
		 // int searchLinear = linearSearch(array);
		 // System.out.println(searchLinear);
		 
		 // int searchBinary = binarySearch(array, 80);
		  
		// System.out.println(searchBinary);
		 
		//int[] arr = rotateArray(array, -1);
		// for (int val : arr)
		// System.out.print(val+" ");
		// bubbleSort(array);
		// selectionSort(array);
		//insertionSort(array);
		//display(array);

	}

	public static int[] takeinput() {
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		return arr;

	}

	public static void display(int[] array) {
		for (int val : array)
			System.out.println(val);
	}

	public static int linearSearch(int[] array, int item) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == item)
				return i;
		}
		return -1;
	}

	public static int binarySearch(int[] array, int item) {
		int lo = 0, hi = array.length - 1, mid = (lo + hi) / 2;
		while (lo <= hi) {
			if (item > array[mid])
				lo = mid + 1;
			else if (item < array[mid])
				hi = mid - 1;
			else if (item == array[mid])
				return mid;
			mid = (lo + hi) / 2;
		}
		return -1;

	}

	public static int[] rotateArray(int[] array, int nr) {
		int r, L = array.length;
		if (nr < 0)
			nr = nr + L;
		int[] arr = new int[L];

		for (int i = 0; i < L; i++) {
			if (i < nr)
				arr[i] = array[i + L - nr];
			else
				arr[i] = array[i - nr];
		}
		return arr;

	}

	public static void bubbleSort(int[] array) {
		int L = array.length;
		for (int counter = 0; counter < L - 1; counter++) {
			for (int j = 0; j < L - 1 - counter; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}

			}

		}

	}

	
	 /* public static void subsets(int[] array) { int nCr=
	 fact(n)/(fact(n-r)*fact(r)) } public static int fact(int n) { for(int i=1;
	  i<=n;i++) }*/
	 
	public static void selectionSort(int[] array) {
		int L = array.length, j, counter;
		for (counter = 0; counter < L - 1; counter++) {
			int min = counter;
			for (j = counter + 1; j <= L - 1; j++) {
				if (array[j] < array[min])
					min = j;

			}
			int temp = array[min];
			array[min] = array[counter];
			array[counter] = temp;
		}
	}

	 

}
