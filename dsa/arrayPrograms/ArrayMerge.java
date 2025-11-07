import java.util.Arrays;
import java.util.Scanner;

public class ArrayMerge {
 public static void main(String[] args) {
        int[] arr1=new int[5];
        int[]arr2=new int[4];
        Scanner sc=new Scanner(System.in);
        System.out.println("array1 before collect data"+Arrays.toString(arr1));

        for(int i=0;i<arr1.length;i++) {
        	System.out.println("enter "+i+" position element");
        	 arr1[i]=sc.nextInt();
        }
        System.out.println("array1 after collecting data"+Arrays.toString(arr1));
  
        
        System.out.println("==================================");
        System.out.println("array2 before collect data"+Arrays.toString(arr2));

        for(int i=0;i<arr2.length;i++) {
        	System.out.println("enter "+i+" position element");
        	 arr2[i]=sc.nextInt();
        }
        System.out.println("array2 after collecting data"+Arrays.toString(arr2));
  
        
        System.out.println("========================");
        
        
        int[]merged=new int[arr1.length+arr2.length];

        for(int i=0;i<arr1.length;i++) {
        	 merged[i]=arr1[i];
        }
        System.out.println("merged array "+Arrays.toString(merged));

        for(int i=0;i<arr2.length;i++) {
       	 merged[arr1.length+i]=arr2[i];
       }
        System.out.println("merged array "+Arrays.toString(merged));

	
	}
}
