public class MissingNumber{
    static int missingNumberBrute(int arr[], int n){
        for(int i = 1; i <= n; i++){
            int flag = 0;
            for(int j = 0; j < n - 1 ; j++){
                if(arr[j] == i) {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) return i;
        }
        return 0;
    }
    static int missingNumberBetter(int arr[], int n){
        int hash[] = new int[n + 1];
        for(int i = 0; i < n - 1; i++){
            hash[arr[i]] = 1;
        }
        for(int i = 1; i <= n; i++){
            if(hash[i] == 0) return i;
        }
        return 0;
        
    }
    static int missingNumberOptimalSum(int arr[], int n){
        int sum1 = (n * (n + 1)) / 2;
        int sum2 = 0;
        for(int i = 0; i <  n - 1; i++) sum2 += arr[i];
        return sum1 - sum2;
        
    }
    static int missingNumberOptimalXOR(int arr[], int n){
        int xor1 = 0;
        int xor2 = 0;
        for(int i = 0; i < n-1; i++){
            xor2 = xor2 ^ arr[i];
            xor1 = xor1 ^ (i + 1);
        }
        xor1 = xor1 ^ n;
        return xor1 ^ xor2;
        
    }
    public static void main(String[] args) {
        int arr[] = {1, 2 , 4 ,5};
        int n = arr.length + 1;
        System.out.println(missingNumberBrute(arr, n));
        System.out.println(missingNumberBetter(arr, n));
        System.out.println(missingNumberOptimalSum(arr, n));
        System.out.println(missingNumberOptimalXOR(arr, n));
        
    }
}