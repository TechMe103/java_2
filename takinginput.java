import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Declare Scanner only once

        System.out.println("Enter your lucky no.:");
        int num1 = sc.nextInt();

        // Consume the leftover newline
        sc.nextLine();

        System.out.println("Lucky number is: " + num1);

        System.out.println("Enter string:");
        String name = sc.nextLine();

        System.out.println("String is: " + name);
    }
}
