import java.util.Scanner;

public class transposeMatrix {
    static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] findTranspose(int[][] matrix , int r , int c){
        int[][] ans = new int[c][r];

        for(int i=0; i< c; i++){
            for(int j=0; j< r; j++){
                ans[i][j] = matrix[j][i];
            }
        }
        return ans;
    }
    static int[][] TransposeInPlace(int[][] matrix , int r , int c){

        for(int i=0; i< c; i++){
            for(int j=i; j< r; j++){

                int temp= matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]= temp;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner( System.in);
        System.out.println("Enter no of rows and columns of matrix");

        int r=sc.nextInt();
        int c= sc.nextInt();

        int[][] matrix= new int[r][c];
        int totalEle = r*c;
        System.out.println("Enter" +totalEle+ "Values:");

        for(int i=0; i< r ; i++){
            for(int j=0; j< c; j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Input matrix:");
        printMatrix(matrix);
        System.out.println("Transpose of matrix IS:");

        //int[][] ans= findTranspose(matrix, r, c);
        //printMatrix(ans);
        int[][] ans=TransposeInPlace(matrix, r, c);
        printMatrix(ans);

        
    }
}
