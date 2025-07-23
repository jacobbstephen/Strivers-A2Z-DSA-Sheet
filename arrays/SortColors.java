public class SortColors {
    // Brute is by using any of the sorting algorithm
    static void ansBetter(int nums[]){
        int count0 = 0, count1 = 0, count2 = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            if(nums[i] == 0) count0++;
            else if(nums[i] == 1) count1++;
            else count2++;
        }
        for(int i = 0; i < count0; i++) nums[i] = 0;
        for(int i = count0; i < count0 + count1; i++) nums[i] = 1;
        for(int i = count0 + count1; i < n; i++) nums[i] = 2;
    }
    // Dutch Flag Algorithm
    static void swap(int nums[], int start, int end){
        int temp = nums[end];
        nums[end] = nums[start];
        nums[start] = temp;
    }
    static void ansOptimised(int nums[]){
        int n = nums.length;
        int low = 0, mid = 0, high = n - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1) mid++;
            else {
                swap(nums, high, mid);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {0, 1, 2, 0, 1 ,2, 1, 2, 0, 0, 1};
        ansOptimised(nums);
        for(int num: nums) System.out.print(num + " ");
        System.out.println();

    }
}
