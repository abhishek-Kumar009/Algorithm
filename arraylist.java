import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		int[] arr1= {10,20,20,30,30,50,50,60,80,90,100};
		int[] arr2= {10,10,20,30,30,40,50,70,70};
		intersection(arr1, arr2);
		

	}
	public static void intersection(int[] arr1, int[] arr2) {
		ArrayList<Integer> list= new ArrayList<>();
		int i=0,j=0;
		 while(i < arr1.length && j<arr2.length) {
			 if(arr1[i] < arr2[j])
				 i++;
			if(arr1[i] != arr2[j]) {
				j++;
			}
			else if(arr1[i] == arr2[j]) {
				list.add(arr1[i]);
				i++;
				j++;
			}
			
		 }
		 System.out.println(list);
		
	}

}
