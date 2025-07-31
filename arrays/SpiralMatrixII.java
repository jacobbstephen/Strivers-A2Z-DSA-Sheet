public class SpiralMatrixII {
    static void printMatrix(int [][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] generateMatrix(int n) {
        int [][] matrix = new int[n][n];
        int top = 0, bottom = n - 1;
        int left = 0, right = n - 1;
        int num = 1;
        while(top <= bottom && left <= right){
            for(int i = left; i <= right; i++) matrix[top][i] = num++;
            top++;
            for(int i = top; i <= bottom; i++) matrix[i][right] = num++;
            right--;
            if(top <= bottom){
                for(int i = right; i >= left; i--) matrix[bottom][i] = num++;
                bottom--;
            }
            if(left <= right){
                for(int i = bottom; i >= top; i--) matrix[i][left] = num++;
                left++;
            }
            
        }
        return matrix;

    }

    public static void main(String[] args) {
        printMatrix(generateMatrix(3));
    }
}
