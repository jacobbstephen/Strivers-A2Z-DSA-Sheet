import java.util.HashMap;

public class SubArraySumEqualsK {
    static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int prefixSum = 0, cnt = 0;
        map.put(0,1);
        for(int i = 0; i < n; i++){
            prefixSum += nums[i];
            int rem = prefixSum - k;
            cnt += map.getOrDefault(rem, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1 );
        }
        return cnt;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -3, 1, 1, 1, 4, 2, -3};
        int k = 3;
        System.out.println("Subarray Count = " + subarraySum(arr, k));

    }
}
