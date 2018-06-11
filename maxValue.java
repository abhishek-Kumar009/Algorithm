import java.util.Scanner;

public class maxValue {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int N= sc.nextInt();
		int[] arr= new int[N];
		for(int i= 0; i< arr.length; i++)
			arr[i]= sc.nextInt();
		System.out.println(maximumValue(arr));

	}
	public static int maximumValue(int[] arr) {
		int i,max= arr[0];
		
				for(i= 0; i< arr.length - 1; i++) {
					if(arr[i] > arr[i+1]);
					max= arr[i];
				}
				return max;
	}

}
