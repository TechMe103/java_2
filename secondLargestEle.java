

public class secondLargestEle {
   
    // Method to find the maximum value in an array
    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    // Method to find the second maximum value in an array
    static int findSecondMax(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        
        int mx = findMax(arr);
        
        // Replace the maximum value with a very small number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        
        int secondMax = findMax(arr);
        return secondMax;
    }

    public static void main(String[] args) {
        // Sample array to test the functions
        int[] arr = {12, 35, 1, 10, 34, 1};
        
        // Print min and max values
        System.out.println("Integer.MIN_VALUE: " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE: " + Integer.MAX_VALUE);
        
        // Find and print the second maximum element
        try {
            int secondMax = findSecondMax(arr);
            System.out.println("Second max element: " + secondMax);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
