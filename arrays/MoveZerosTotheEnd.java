import java.util.ArrayList;
import java.util.List;

public class MoveZerosTotheEnd {
    static void moveZeroToEndBrute(int arr[], int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            if(arr[i] != 0) list.add(arr[i]);
        }
        for(int i = 0; i < list.size(); i++) arr[i] = list.get(i);
        for(int i =  list.size(); i < n; i++) arr[i] = 0; 
    }
    static void moveZeroToEndOptimised(int arr[], int n){
        int idx = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] != 0) arr[idx++] = arr[i]; 
        }
        for(int i = idx; i < n; i++) arr[i] = 0;
    }
    public static void main(String[] args) {
        int arr[] = {1, 0,  2, 3, 4, 0, 5, 6, 7};
        int n = arr.length;
        moveZeroToEndOptimised(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
}
