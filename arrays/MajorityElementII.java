
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityElementII {
    static List<Integer> ansBrute(int nums[]){
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(list.isEmpty() || list.get(0) != nums[i]){
                int cnt = 0;
                for(int j = 0; j < n; j++){
                    if(nums[j] == nums[i]) cnt++;
                }
                if(cnt > n / 3) list.add(nums[i]);
                if(list.size() == 2) break;
            }
        }
        return list;
    }
    static List<Integer> ansBetter(int nums[]){
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int minCount = n / 3 + 1;
        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if(map.get(nums[i]) == minCount) list.add(nums[i]);
        }
        return list;
    }

    static List<Integer> ansOptimised(int nums[]){
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        int cnt1 = 0, cnt2 = 0;
        int elem1 = Integer.MIN_VALUE, elem2 = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if(cnt1 == 0 && nums[i] != elem2){
                cnt1 = 1;
                elem1 = nums[i];
            } else if(cnt2 == 0 && nums[i] != elem1){
                cnt2 = 1;
                elem2 = nums[i];
            } else if(elem1 == nums[i]) cnt1++;
            else if(elem2 == nums[i]) cnt2++;
            else{
                cnt1--; cnt2--;
            }
        }
        cnt1 = 0; cnt2 = 0;
        for(int i = 0; i < n; i++){
            if(elem1 == nums[i]) cnt1++;
            if(elem2 == nums[i]) cnt2++;
        }
        int minCount = n / 3 + 1;
        if(cnt1 >= minCount) list.add(elem1);
        if(cnt2 >= minCount) list.add(elem2);
        return list;
    }
    public static void main(String[] args) {
        int nums[] = {1, 1, 1, 1, 3, 2, 2, 2};
        System.out.println("Answer Brute force: " + ansBrute(nums));
        System.out.println("Answer Better: " + ansBetter(nums));
        System.out.println("Answer Optmised: " + ansOptimised(nums));
    }
}
