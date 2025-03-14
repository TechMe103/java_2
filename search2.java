public class search2 {

    static boolean search(int[] arr , int n , int target , int idx){

        if(idx >= n){
            return false;
        }
        if( arr[idx] == target) return true;

        if(search(arr, n, target, idx+1)){
            return true;
        }
        else{
            return false;
        }
        //return search(a , n, target , idx+1);


    }
    static int findIndex(int[] arr , int n , int target , int idx){

        if(idx >= n){
            return -1;
        }
        if( arr[idx] == target) return idx;


        return findIndex(arr , n, target , idx+1);


    }
    public static void main(String[] args) {
        int[] arr= { 1 , 2,3,4};
        int target=3;
        int n= arr.length;
        if(search(arr ,n, target , 0)){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
        System.out.println("Found at index:");
        System.out.println(findIndex(arr, n, target, 0));
    }
}
