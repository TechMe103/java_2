public class sumOfDigits {

    static int sod(int n){
        //base case
        if(n > 0  && n <= 9){
            return n;
        }

        //recursive case
        int smallAns= sod(n/10);  //first digitss

        //selfwork
        int ans= smallAns + n % 10;
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(sod(1234));
    }
}
