public class RotateImage {

    static void printMatrix(int [][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    // ans brute
    static void ansBrute(int[][] matrix){
        int n = matrix.length;
        int ansMatrix[][] = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                ansMatrix[j][n - 1 - i] = matrix[i][j];
            }
        }

        printMatrix(ansMatrix);
    }

    // ansBetter 

    static void reverse(int[] mat){
        
        int start = 0, end = mat.length - 1;
        while(start <= end){
            int temp = mat[start];
            mat[start] = mat[end];
            mat[end] = temp;
            start++; end--;
        }
    }


    static void ansOptimised(int[][] matrix){
        int n = matrix.length;
        // 1. Transpose
        for(int i = 0; i < n-1; i++){
            for(int j = i + 1; j < n; j++){
                // swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // 2. Reverse each row
        for(int i = 0; i < n; i++){
            reverse(matrix[i]);
        }
        printMatrix(matrix);
    }


    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        matrix[0][0] = 1;  matrix[0][1] = 2;  matrix[0][2] = 3;
        matrix[1][0] = 4;  matrix[1][1] = 5;  matrix[1][2] = 6;
        matrix[2][0] = 7;  matrix[2][1] = 8;  matrix[2][2] = 9;
        // ansBrute(matrix);
        ansOptimised(matrix);
    }

}
