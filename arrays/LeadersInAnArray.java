
import java.util.ArrayList;
import java.util.List;

public class LeadersInAnArray {
    // Just finding the leaders
    static List<Integer> ansBrute(int nums[]){

        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < n; i++){
            Boolean leader = true;
            for(int j = i + 1; j < n; j++){
                if(nums[j] > nums[i]){
                    leader = false;
                    break;
                }
            }
            if(leader) list.add(nums[i]);
        }
        return list;
    }

    // Finding the leaders and replacing as in leetcode 1299
    static int[] ansOptimised(int nums[]){
        int n = nums.length;
        if(n == 1){
            nums[n - 1] = -1;
            return nums;
        }
        int max = Integer.MIN_VALUE;
        for(int i = n - 1; i >= 0; i--){
            int temp = nums[i];
            nums[i] = max;
            if(temp > max) max = temp;
        }
        nums[n - 1] = -1;
        return nums;
    }
    public static void main(String[] args) {
        int arr[] = {17,18,5,4,6,1};
        System.out.print("Answer using Brute: ");
        List<Integer> list = ansBrute(arr);
        for(Integer li: list) System.out.print(li + " ");
        System.out.println();
        System.out.print("Answer using Optimised: ");
        int ans[] = ansOptimised(arr);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
