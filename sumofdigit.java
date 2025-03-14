import java.util.Scanner;

public class sumofdigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Input number from the user
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); // Initialize n
        int sum_ofdigit = 0;
        int original_n = n; // Store the original value of n

        // Calculate the sum of digits
        while (n > 0) {
            sum_ofdigit += n % 10; // Add the last digit of n to sum_ofdigit
            n = n / 10; // Remove the last digit of n
        }

        // Print the result
        System.out.println("Sum of digits in " + original_n + " is: " + sum_ofdigit);
        
        sc.close(); // Close the Scanner
    }
}
