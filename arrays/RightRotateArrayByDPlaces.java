public class RightRotateArrayByDPlaces{
    static void rightRotateBrute(int arr[], int n, int d){
        d = d % n;
        int temp[] = new int[n - d];
        for(int i = n - d; i < n; i++) temp[i - (n - d)] = arr[i];
        temp[temp.length - 1] = arr[d];
        for(int i = 0; i <= d; i++) arr[i + d] = arr[i];
        for(int i = 0; i < n - d - 1; i++) arr[i] =  temp[i];
        arr[n - 1] = temp[temp.length - 1];
    }
    // optimised
    static void reverse(int arr[], int start, int end){
        while(start <= end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rightRotateOptimised(int arr[], int n, int d){
        reverse(arr, 0, d);
        reverse(arr, d + 1, n - 1);
        reverse(arr, 0, n - 1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        int d = 3; 
        int n = 7;
        rightRotateOptimised(arr, n, d);    
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
