public class search3 {

    static void findAllIndices(int[] arr , int target ,int n, int idx){

        //base case
        if(idx >= n) return;

        //self work
        if(arr[idx] == target){
            System.out.println(idx);
        }

        //recursive case
        findAllIndices(arr, target, n, idx+1);
    }
    public static void main(String[] args) {
        int[] arr={ 1 , 2, 4,5,3,2,1,4};
        int target= 2;
        int n= arr.length;
        findAllIndices(arr, target, n, 0);


    }
}
