class Operation2{

 public static void main(String[]args){
    int a=10;
    int b=20;
    boolean case1=a>b;//false
    boolean case2=a<b;//true
    System.out.println("-----logical and---------");
   System.out.println(case1&&case2);//false&&true  - false
   System.out.println(case2&&case1);//true&&false  -false
  System.out.println(case1&&case1);//false&&false  - false
   System.out.println(case2&&case2);//true&&true   -true
    System.out.println("-----logical or---------");
   System.out.println(case1||case2);//false||true  -true
   System.out.println(case2||case1);//true||false  -true
   System.out.println(case2||case2);//true||true  - true
  System.out.println(case1||case1);//false ||false -false
    System.out.println("-----logical not---------");
   System.out.println(!case1);//!false  -true
   System.out.println(!case2);//!true   -false



 }

}