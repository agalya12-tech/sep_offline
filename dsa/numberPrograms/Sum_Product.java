class SumOfNumbers {
    public static void main(String[] args) {
        int sum=0;
        int product=1;
        for(int i=1;i<=5;i++){
            sum=sum+i;
            product=product*i;
        }
        System.out.println(sum);
        System.out.println(product);

    }
}