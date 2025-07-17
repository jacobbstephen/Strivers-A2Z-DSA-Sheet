public class SecondLargest {
    static int  secondLargest(int arr[], int n){
        int largest = arr[0];
        int secondL = -1;
        for(int i = 1; i < n; i++){
            if(arr[i] > largest){
                secondL = largest;
                largest = arr[i];
            }else if(arr[i] < largest && arr[i] > secondL){
                secondL = arr[i];
            }
        }
        return secondL;
    }
    public static void main(String[] args) {
        int arr[] = {1,3,2,5,4};
        int n = 5;
        System.out.println(secondLargest(arr, n));
    }
}
