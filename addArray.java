import java.util.*;
import java.util.ArrayList;
public class Main {
    static Scanner sc= new Scanner(System.in);
    public static void main(String args[]) {
        int n1,n2,i;
        n1= sc.nextInt();
        int[] arr1= new int[n1];
        for(i=0;i < arr1.length; i++)
            arr1[i]= sc.nextInt();
             n2= sc.nextInt();
        int[] arr2= new int[n2];
        for(i=0;i < arr2.length; i++)
            arr2[i]= sc.nextInt();
            sumOfArray(arr1,arr2, n1 ,n2);

    }
    public static void sumOfArray(int[] arr1, int[] arr2, int n1, int n2){
        ArrayList<Integer> list= new ArrayList<>();
         int j= n2 - 1,i= n1 - 1,carry= 0,sum= 0;
          
          while(i >= 0 || j >= 0){
              sum= arr1[i] + arr2[j] + carry;
              int r= sum % 10;
              list.add(0,sum);
              carry= sum/10;
              i--;
              if(j > 0){
              j--;
                  }else{arr2[j]= 0;}
              
          }
          if(carry > 0)
          System.out.println(carry+", ");
           for(int k= 0;k < list.size(); k++)
           System.out.println(list.get(i)+", ");
           System.out.println(" END");
           
    
          
          
        
    }
}