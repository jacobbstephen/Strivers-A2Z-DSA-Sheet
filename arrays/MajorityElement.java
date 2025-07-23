import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    static int ansBrute(int nums[]){
        int elem = -1;
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            int num = nums[i];
            count = 0;
            for(int j = 0; j < n; j++){
                if(nums[j] ==  num) count++;
            }
            if(count > n / 2){
                elem = num;
                break;
            }
        }

        return elem;
    }
    static int ansBetter(int nums[]){
        int elem = -1;
        Map<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for(Integer key: map.keySet()){
            if(map.get(key) > n / 2){
                elem = key;
                break;
            }
        }
        return elem;
    }
    // Moores Voting Algorithm
    static int ansOptimised(int nums[]){
        int elem = -1;
        int count = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(count == 0){
                elem = nums[i];
                count++;
            }
            else if(nums[i] == elem) count++;
            else count--;
        }
        // Optional => Required if the qn specifies that the array may or may not contain majority element
        count = 0;
        for(int i = 0; i < n; i++){
            if(nums[i] == elem) count++;
        }
        return count > n / 2 ? elem : -1;
    }
    
    public static void main(String[] args) {
        int nums[] = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 5, 5, 5, 5};
        // int nums[] = {7, 7, 5, 7, 5, 1, 5, 7, 5, 5, 7, 7, 1, 1, 1, 1}; => Executes the optional condition
        System.out.println("Answer Using Brute: " + ansBrute(nums));
        System.out.println("Answer Using Better: " + ansBetter(nums));
        System.out.println("Answer Using Moores Voting Algorithm: " + ansOptimised(nums));
    }
}
