class ArraysExample{

    void sum_of_array(){

        int[] arr= {1 , 2, 3, 4, 5};
        int sum=0;

        for(int i=0; i< arr.length; i++){
            sum+=arr[i];
            System.out.println(sum);
        }
    }
}

public class sumofArray {
    public static void main(String[] args) {
        ArraysExample obj= new ArraysExample();
        obj.sum_of_array();
    }
    
}
