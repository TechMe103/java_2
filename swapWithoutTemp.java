public class swapWithoutTemp {
    static void swapWithoutTemps(int a , int b){
        System.out.println("Original values before swap");
        System.out.println("A:" +a);
        System.out.println("B:" +b);

        a= a+b;
        b= a-b;
        a=a-b;
        System.out.println("Values after swap:");
        System.out.println("A:" +a);
        System.out.println("B:" +b);


    }
    public static void main(String[] args) {
        int a=9; 
        int b=3;
        int[] arr={ 1, 2, 3, 4, 6};
        swapWithoutTemps(a, b);
    }
    
}
