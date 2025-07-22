
import java.util.HashMap;
import java.util.Map;

public class LongestSubarrayWithSumK {
    static int ansBrute(int nums[], int k){
        int len = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int sum = 0;
            for(int j = i; j < n; j++){
                sum += nums[j];
                if(sum == k) len = Math.max(len,  j - i + 1);
            }
        }
        return len;
    }
    // for +ve, -ve and zeros
    static int ansBetter(int nums[], int k){
        int len = 0;
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum  += nums[i];
            if(sum == k) len = Math.max(len, i + 1);
            if(map.containsKey(sum - k)){
                int size = i - map.get(sum - k);
                len = Math.max(len, size);
            }
            if(!map.containsKey(sum)) map.put(sum, i);
        }
        return len;
    }
    // Can be optimised only for postives and zeros
    static int ansOptimized(int nums[], int k){
        int maxLen = 0;
        int left = 0, right = 0;
        int sum = nums[0];
        int n = nums.length;
        while(right < n){
            while(left <= right && sum > k){
                sum -= nums[left++];
            }
            if(sum == k) maxLen = Math.max(maxLen, right - left + 1);
            right++;
            if(right < n) sum += nums[right];
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1, 1, 1, 1, 4, 2, 3};
        int k = 3;
        
        System.out.println(ansOptimized(nums, k)); 
    }
}
