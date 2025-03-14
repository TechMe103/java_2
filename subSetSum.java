public class subSetSum {

    static void subsetsum(int[] arr , int n, int idx, int currSum){

        //base case
        if(idx >= n){
            System.out.println(currSum);
            return;
        }
        //curr idx+ sum
        subsetsum(arr, n, idx+1, currSum+ arr[idx]);

        //curr ans
        subsetsum(arr, n, idx+1, currSum);
    }
    public static void main(String[] args) {
        int[] arr={2 , 4, 5};
        subsetsum(arr , arr.length , 0 , 0);

    }
}
