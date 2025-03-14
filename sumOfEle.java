public class sumOfEle {

    static int sumofarr(int[] arr , int idx){

        int n= arr.length;

        //base case
        if(idx == n){
            return 0;
        }

        //recursive case
        int smallAns= sumofarr(arr, idx+1);

        //self work
        return smallAns + arr[idx];

    }
    public static void main(String[] args) {
        int[] arr= {1 ,2 , 3,4 };
        System.out.println(sumofarr(arr , 0));
    }
}
