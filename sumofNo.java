import java.util.Scanner;

public class sumofNo {
    public static void main(String[] args){
        Scanner sc= new Scanner( System.in);
        int n= sc.nextInt();
        int sum=0;
        int num=1;
        while ( num <= n) {
            System.out.println(num);
            sum=sum+num;  //sum+=num
            num++;
        }
        System.out.println(sum);
    }
    
}
