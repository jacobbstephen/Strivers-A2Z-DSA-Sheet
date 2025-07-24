public class MaximumSubArraySum {
    static int maxSubArray(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            sum = sum + nums[i];
            if(maxSum < sum) maxSum = sum;
            if(sum < 0) sum = 0;
        }
        return maxSum;

    }
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(arr));
    }
}