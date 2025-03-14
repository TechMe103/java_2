public class sort01201 {
    static void displayarr(int[] num){
        for(int val : num){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr , int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static void sort012(int[] num){
        int lo = 0;
        int mid = 0;
        int hi = num.length - 1;
        
        while(mid <= hi){
            if(num[mid] == 0){
                swap(num, mid, lo);
                mid++;
                lo++;
            }
            else if(num[mid] == 1){
                mid++;
            } else {
                swap(num, mid, hi);
                hi--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 2, 1, 1, 2, 0, 0, 2, 1, 2, 1};
        displayarr(arr);
        sort012(arr);
        displayarr(arr);
    }
}
