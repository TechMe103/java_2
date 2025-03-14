public class sqrt {

    static int Sqrt(int x){

        int st=0; 
        int end=x;
        int ans=-1;

        while(st <= end){
            int mid= st+ (end- st) /2;
            int val= mid + mid;
            if(val ==x){
                return mid;
            }
            else if(val < x){
                ans= mid;
                st= mid+1;

            }else {
                end= mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int x= 4;
        System.out.println(Sqrt(x));
    }
}
