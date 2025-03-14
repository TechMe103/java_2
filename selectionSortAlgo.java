public class selectionSortAlgo {

    static void selectionSort(int[] arr){

        int n= arr.length;

        for(int i=0; i< n-1 ; i++){
            //find min ele in unsorted part of array
            int min_index= i;
            
            for(int j=i+1 ; j<n ; j++){
                if(arr[j] < arr[min_index]){
                    min_index=j;
                }
            }
            //swap curr ele and min ele
            int temp= arr[i];
            arr[i]= arr[min_index];
            arr[min_index]= temp;
        }
    }
    public static void main(String[] args) {
        int[] arr={7 , 4, 5, 1, 2};
        selectionSort(arr);

        for(int i=0; i< arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
