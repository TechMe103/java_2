public class matrixSearch {
    public boolean searchMatrix(int[][] arr , int target){

        int n= arr.length;
        int m= arr[0].length;
        int st=0;
        int end= n-1;

        while( st <= end){

            int mid= st + (end - st) /2;
            int midEle = arr[mid/m][mid%m];

            if(midEle == target) return true;
            if(midEle > target) {
                end= mid-1;
            }else{
                st= mid+1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] arr={[1 , 3, 5, 7],[10 , 11, 16, 20],[23, 30, 34, 60]};
        int target= 3;
        System.out.println(searchMatrix(arr , target));

    }
}
