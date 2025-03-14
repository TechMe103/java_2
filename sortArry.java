public class sortArry {

    static void displayarr(int[] num){

        for(int val : num){
            System.out.println(val + " ");
        }
        System.out.println();
    }
    static void sortarr(int[] num){

        int n= num.length;
        int x=-1;
        int y=-1;
        if(n <= 1){
            return;
        }

        //process all adj ele
        for(int i=1; i<n ; i++){
            if(num[i-1] > num[i]){
                if(x==-1){
                    x=i-1;
                    y=i;  //1st conflict
                }
                else{
                    y=i;  //2nd conflict
                }
            }
        }
        //swap x, y
        int temp= num[x];
        num[x]= num[y];
        num[y]= temp;
    }
    public static void main(String[] args) {
        int[] num={10,5, 6, 7, 8, 9, 3 };
        sortarr(num);
        displayarr(num);
    }
}
