import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int result[] = new int[2];
        for(int i = 0; i < n; i++){
            int more = target - nums[i];
            if(map.containsKey(more)){
                result[0] = map.get(more);
                result[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 9;
        int result[] = twoSum(nums, target);
        for(int res: result) System.out.print(res + " ");
        System.out.println();
    }
}
