public class MaximumConsecutiveOnes {
    static int maximumConsecutiveOnes(int arr[]){
        int max = 0;
        int cnt = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                cnt = 0;
                continue;
            }
            cnt++;
            max = Math.max(max, cnt);
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 1, 1, 1, 0, 1, 1};
        System.out.println(maximumConsecutiveOnes(arr));

    }
}
