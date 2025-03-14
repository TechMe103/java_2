import java.util.Scanner;

public class spiralOrder1{

    static void printMatrix(int[][] matrix ){
        for(int i=0; i< matrix.length; i++){
            for(int j=0; j< matrix[i].length; j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] printSpiralOrder(int n , int r , int c){

        int topRow=0 , bottomRow= r-1 , leftCol=0 , rightCol=c-1;
        

        int[][] matrix= new int[n][n];
        
        int curr= 1;
        while(curr < r * c){
            // Print top row from left to right
            for (int j = leftCol; j <= rightCol && curr < r * c; j++) {
                System.out.print(matrix[topRow][j] + " "); // Corrected to use print
                curr++;
            }
            topRow++;
            
             // Print right column from top to bottom
            for (int i = topRow; i <= bottomRow && curr < r * c; i++) {
                System.out.print(matrix[i][rightCol] + " "); // Corrected to use print
                curr++;
            }
            rightCol--;
            
            // Print bottom row from right to left
            for (int j = rightCol; j >= leftCol && curr < r * c; j--) {
                System.out.print(matrix[bottomRow][j] + " "); // Corrected to use print
                curr++;
            }
            bottomRow--;
            
            // Print left column from bottom to top
            for (int i = bottomRow; i >= topRow && curr < r * c; i--) {
                System.out.print(matrix[i][leftCol] + " "); // Corrected to use print
                curr++;
            }
            leftCol++;
            
        
        }
        return matrix;
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
        int n;
        //printSpiralOrder(matrix, r, c);
        int[][] matrix1=printSpiralOrder( n, r, c);
        printMatrix(matrix1);

        sc.close(); // Close the Scanner to avoid resource leaks
    }
    
}// wrong make corrections:
