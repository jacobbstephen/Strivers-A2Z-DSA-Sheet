
import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    static void printRow(List<Integer> row){
        for(Integer elem: row){
            System.out.print(elem + " ");
        }
        System.out.println();
    }
    static int findnCr(int n, int r){
        int res = 1;
        for(int i = 0; i < r; i++){
            res = res * (n - i);
            res = res / (i + 1);
        }
        return res;
    }
    // Assuming index start at 1
    // Type 1 => Given row and column number, give me the element at that row
    static int getElement(int row, int col){
        // Formula is( row -1)
        //                      C
        //                      (col - 1)
        row--; col--;
        return findnCr(row, col);
    }
    // Type 2 => Given row  number, print the row
    static List<Integer> getRowBrute(int row){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= row; i++){
            list.add(getElement(row, i));
        }
        return list;
    }
    static List<Integer> getRowOptimised(int row){
        List<Integer> list = new ArrayList<>();
        int ans = 1;
        for(int i = 1; i <= row; i++){
            list.add(ans);
            ans = ans * (row - i);
            ans = ans / i;
       
        }
        return list;
    }
    // Type 3 => Given row number, print the entire row in the pascals Triangle 
    static List<List<Integer>> printPascalTriangleBrute(int rows){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp;
        for(int i = 1; i <= rows; i++){
            temp = new ArrayList<>();
            for(int j = 1; j <= i; j++){
                temp.add(getElement(i, j));
            }
            ans.add(temp);
        }
        return ans;

    }

    static List<List<Integer>> printPascalTriangleOptimised(int rows){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp;
        for(int i = 1; i <= rows; i++){
            temp = getRowOptimised(i);
            ans.add(temp);
        }
        return ans;

    }
    
    public static void main(String[] args) {
        // Type 1
        System.out.println("Element = " + getElement(5, 2));
        // Type 2
        printRow(getRowBrute(6));
        printRow(getRowOptimised(6));
        // Type3
        System.out.println("Using Brute force");
        List<List<Integer>> ans = printPascalTriangleBrute(6);
        for(List<Integer> list:ans){
            printRow(list); 
        }
        System.out.println("Using Optimised method");
        ans.clear();
        ans = printPascalTriangleOptimised(6);
        for(List<Integer> list:ans){
            printRow(list); 
        }
    }
}
