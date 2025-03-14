public class searchMatrix {

    public static boolean searchMatrix1(int[][] arr , int target){

        int n= arr.length;
        int m= arr[0].length;
        int i=0;
        int j=m-1;

        if(i < n  &&  j>=0){

            if(arr[i][j] == target)  return true;
            if(target < arr[i][j]){
                j--;
            }
            else{
                i++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };
        int target = 60;
        System.out.println(searchMatrix1(arr, target)); // Output: true

    }
}
