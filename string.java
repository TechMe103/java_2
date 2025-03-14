import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        String s= sc.next();
        String s1= sc.nextLine();

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s.substring(2 , 4));

        char ch= s.charAt(0);
        System.out.println(ch);

        for(int i=0; i< s.length() ; i++){
            System.out.println(s.charAt(i));
        }

        

        

    }
}
