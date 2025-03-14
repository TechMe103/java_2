import java.util.Scanner;

public class sumofseries {
    public static void main(String[] args){
        Scanner sc= new Scanner( System.in);
        int n= sc.nextInt();
        int ans=0;

        for(int i=1; i<=n ; i++){
            if(i % 2==0){
                ans-=1;   //even
            }else{
                ans+=1; //odd
            }
        }
        System.out.println(ans);
    }
}
