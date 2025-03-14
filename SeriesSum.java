import java.util.Scanner;

public class SeriesSum {

    static int seriesSum(int n){

        //base case
        if(n==0)  return 0;

        //recursive case
        return seriesSum(n-1) + n;  //n: selfwork

    }
    static int seriesSum1(int n){

        //base case
        if(n==0)  return 0;
         
        //recursive case
        if(n % 2 == 0){  //even
            return seriesSum1(n-1) - n;
        }
        else{  //odd
            return seriesSum1(n-1) + n;
        }

    }

    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        int n= sc.nextInt();
        System.out.println(seriesSum1(n));
    }
}
