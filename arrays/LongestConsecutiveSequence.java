import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public  static int longestConsecutive(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n; i++) set.add(nums[i]);
        int longest = 0;
        for(int num: set){
            if(!set.contains(num - 1)){
                int count = 1;
                while(set.contains(num + 1)){
                    num++; count++;
                    
                }
                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int nums[] = {100,4,200,1,3,2};
        System.out.println("Ans: " + longestConsecutive(nums)   );
    }
}
