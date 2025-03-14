import java.util.Scanner;

public class spiralOrder {

    // Method to print the matrix
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) { // Use matrix[i].length for column iteration
                System.out.print(matrix[i][j] + " "); // Corrected to use print instead of println
            }
            System.out.println(); // Move to next line after each row
        }
    }

    // Method to print the matrix in spiral order
    static void printSpiralOrder(int[][] matrix, int r, int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalEle = 0;

        while (totalEle < r * c) {
            // Print top row from left to right
            for (int j = leftCol; j <= rightCol && totalEle < r * c; j++) {
                System.out.print(matrix[topRow][j] + " "); // Corrected to use print
                totalEle++;
            }
            topRow++;

            // Print right column from top to bottom
            for (int i = topRow; i <= bottomRow && totalEle < r * c; i++) {
                System.out.print(matrix[i][rightCol] + " "); // Corrected to use print
                totalEle++;
            }
            rightCol--;

            // Print bottom row from right to left
            for (int j = rightCol; j >= leftCol && totalEle < r * c; j--) {
                System.out.print(matrix[bottomRow][j] + " "); // Corrected to use print
                totalEle++;
            }
            bottomRow--;

            // Print left column from bottom to top
            for (int i = bottomRow; i >= topRow && totalEle < r * c; i--) {
                System.out.print(matrix[i][leftCol] + " "); // Corrected to use print
                totalEle++;
            }
            leftCol++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and columns:");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int[][] matrix = new int[r][c];
        int total = r * c;
        System.out.println("Enter " + total + " values:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Input matrix:");
        printMatrix(matrix);

        System.out.println("Spiral order:");
        printSpiralOrder(matrix, r, c);

        sc.close(); // Close the Scanner to avoid resource leaks
    }
}
