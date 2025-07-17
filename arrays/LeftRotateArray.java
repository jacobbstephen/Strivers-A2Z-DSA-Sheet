public class LeftRotateArray {
    static void leftRotate1(int arr[], int n){
        int temp = 0;
        for(int i = 0; i < n - 1; i++){
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
    // use this
    static void leftRotate2(int arr[], int n){
        int temp = arr[0];
        for(int i = 1; i < n ; i++){
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = 5;
        leftRotate2(arr, n);
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
