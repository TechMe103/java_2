import java.util.Arrays;
import java.util.Scanner;

public class SmallAndLarge {
    static String findSmallAndLargestEle(int[] arr) {
        Arrays.sort(arr);
        
        int smallest = arr[0];
        int largest = arr[arr.length - 1];
        
        return "Smallest: " + smallest + ", Largest: " + largest;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
       
        System.out.println(findSmallAndLargestEle(arr));
    }
}
