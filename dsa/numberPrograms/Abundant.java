class Abundant{
 public static void main(String[] args) {
    for(int num=1;num<=50;num++){
        int sum=0;
        for(int i=1;i<num;i++){
            if(num%i==0){
               sum+=i;
            }
        }
        if(sum>num)
         System.out.println(num+"  is an abundant number");
    }
 }
}
/**
 * 
 * 12- 1,2,3,4,6=16
 *     16>12
 * 
 */