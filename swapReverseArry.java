public class swapReverseArry {
    static void swapInArray(int[] arr, int i , int j){
        int temp= arr[i];
        arr[i]= arr[j];
        arr[j]= temp;
    }
    static int[] reverseArray(int[] arr){
        int i=0;
        int j= arr.length-1;
        while(i < j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }
        return arr;

    }
    public static void main(String[] args) {
        int[] arr={ 1, 2, 3, 4, 5};
        int[] ans=reverse  Array(arr);

        for(int i=0; i< ans.length; i++){
            System.out.println(ans[i]+" ");
        
        }
    }
}
