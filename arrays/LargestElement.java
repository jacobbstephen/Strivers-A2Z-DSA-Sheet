

public class LargestElement {
    static int largestElement(int arr[], int n){
        int largest = arr[0];
        for(int i = 1; i < n; i++){
            if(arr[i] > largest) largest = arr[i];
        }
        return largest;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,4};
        int n = 5;
        System.out.println(largestElement(arr, n));
    }
}
