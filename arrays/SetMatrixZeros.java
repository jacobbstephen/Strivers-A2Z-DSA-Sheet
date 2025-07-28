public class SetMatrixZeros{

    // print matrix
    static void printMatrix(int [][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // answer brute -> DOESN'T WORK FOR -VE NUMBERS
    static void markRow(int i, int[][] matrix){
        for(int j = 0; j < matrix[0].length; j++){
            if(matrix[i][j] != 0) matrix[i][j] = -1;
        }
    }
    static void markCol(int j, int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][j] != 0) matrix[i][j] = -1;
        }
    }

    static void ansBrute(int [][] matrix){
        int n = matrix.length;
        int m = matrix[0].length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    markRow(i, matrix);
                    markCol(j, matrix);
                }
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == -1) matrix[i][j] = 0;
            }
        }
    }
    // ansBetter

    static void ansBetter(int matrix[][]){
        int n = matrix.length;
        int m = matrix[0].length;
        boolean row[] = new boolean[n];
        boolean col[] = new boolean[m];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    // ansOptimised -> no extra space

    static void ansOptimised(int [][] matrix){
        // to represent row, we use the 1st or 0th column matrix[][0]
        // to represent col, we use the 1st or 0th row => matrix[0][]
        int m = matrix[0].length;
        int col0 = 1;
        int n = matrix.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j != 0) matrix[0][j] = 0;
                    else col0 = 0;
                }
            }
        }
        // middle portion
        for(int i = 1; i < n; i++){
            for(int j = 1; j < m; j++){
                if(matrix[i][j] == 0) continue;
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        //  for 0th row => 1 to m coloums => they will be zero when matrix[0][0] = 0
        if(matrix[0][0] == 0){
            for(int j = 1; j < m; j++){
                matrix[0][j] = 0;
            }
        }
        // for 0th column =>   1  to n rows => they will be zero when col0 = 0
        if(col0 == 0){
            for(int i = 0; i < n; i++){
                matrix[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        matrix[0][0] = 1; matrix[0][1] = 1; matrix[0][2] = 1; matrix[0][3] = 1;
        matrix[1][0] = 1; matrix[1][1] = 0; matrix[1][2] = 1; matrix[1][3] = 1;
        matrix[2][0] = 1; matrix[2][1] = 1; matrix[2][2] = 0; matrix[2][3] = 1;
        matrix[3][0] = 0; matrix[3][1] = 1; matrix[3][2] = 1; matrix[3][3] = 1;

        ansOptimised(matrix);

        printMatrix(matrix);


    }
}