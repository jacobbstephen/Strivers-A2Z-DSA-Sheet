public class RemoveDuplicates {
    static int removeDuplicates(int arr[], int n){
        int idx = 1;
        for(int i = 1; i < n; i++){
            if(arr[i] != arr[i - 1]) arr[idx++] = arr[i];
        }
        return idx;
    }
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int n = arr.length;
        int size = removeDuplicates(arr, n);
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
