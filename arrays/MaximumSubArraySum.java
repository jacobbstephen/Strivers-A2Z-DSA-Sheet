public class MaximumSubArraySum {
    static int maxSubArray(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int n = nums.length;
        int ansStart = -1, ansEnd = -1;

        for(int i = 0; i < n; i++){
            if(sum == 0) ansStart = i;
            sum = sum + nums[i];
            if(maxSum < sum){
                maxSum = sum;
                ansEnd = i;
                
            }
            if(sum < 0) sum = 0;
        }

        for(int i = ansStart; i <= ansEnd; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return maxSum;

    }
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(arr));
    }
}