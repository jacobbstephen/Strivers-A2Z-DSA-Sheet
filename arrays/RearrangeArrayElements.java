public class RearrangeArrayElements {
    static int[] rearrange(int nums[]){
        int n = nums.length;
        int ans[] = new int[n];
        int positive = 0, negative = 1;
        for(int i = 0; i < n; i++){
            if(nums[i] < 0){
                ans[negative] = nums[i];
                negative += 2;
            }
            else{
                ans[positive] = nums[i];
                positive += 2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        int[] ans = rearrange(nums);;
        for(int i = 0; i <  ans.length; i++){
            System.out.print(ans[i] + " ");
        }
    }
}
