import java.util.ArrayList;
import java.util.Scanner;
public class sortLinear {
	static Scanner sc= new Scanner(System.in);	
	public static void main(String[] args) {
		int n= sc.nextInt();
		int[] arr= new int[n];
		for(int i= 0;i < arr.length; i++)
			arr[i]= sc.nextInt();
		sort(arr);
		

	}
	public static void sort(int[] arr){
		ArrayList<Integer> list= new ArrayList<>();
			int counter, k;	
		for(counter= 0; counter < 3; counter++) {
			for( k= 0; k < arr.length; k++) {
				if(arr[k] == counter)
					list.add(arr[k]);
			}
			
		}
		for(k= 0; k < arr.length; k++) {
			
			System.out.println(list.get(k));
		}
		
		
		
		
	}
}
