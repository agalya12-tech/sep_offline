class Automorphic {
    public static boolean isAutoMorphic(int num){
        int sqr=num*num;
         while(num>0){
            int rem=num%10;
            int sqrRem=sqr%10;
            if(rem!=sqrRem){
             return false;
            }
            num/=10;
            sqr/=10;
        }
        return true;
    }

     public static void main(String[] args) {
        int num=6;
        if(isAutoMorphic(num)){
            System.out.println(num+" is automorphic");
        }else{
            System.out.println(num+" is not an automorphic");
        }    
    }
    
    
}
 
/**
 * 
 * 5  --- 5*5 = 25  ---> automorphic
 * 7 --- 7*7 = 49  ---> not an automorphic
 * 
 * 25----25*25=625 ---> automorphic
 * 16 --- 16*16=256 ---> not an automorphic
 * 
 *  
 */
