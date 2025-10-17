import java.util.Arrays;

public class MoveZerosToEnd {
    
    public static void main(String[] args) {
            
         int []arr={0,0,13,12,0};
	        int index=0;
	        for(int i=0;i<arr.length;i++){
	          int element=arr[i];
	          if(element!=0){
	            arr[index]=element;
	            index++;
	          }
    	        }
        
            //move zeros	        
	        for(int i=index;i<arr.length;i++){
	          arr[i]=0;
	        }


            System.out.println(Arrays.toString(arr));

    }
}
