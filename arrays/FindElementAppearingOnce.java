
import java.util.HashMap;
import java.util.Map;

public class FindElementAppearingOnce {
    static int findBruteUsingLinearSearch(int arr[]){
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            int count = 0;
            int num = arr[i];
            for(int j = 0; j < n; j++){
                if(arr[j] == num) count++;
            }
            if(count == 1) ans = num;

        }
        return ans;
    }
    static int findBetterUsingHash(int arr[]){
        int n = arr.length;
        int ans = 0;
        int max = arr[0];
        for(int i = 0; i < n; i++) max = Math.max(arr[i], max);
        int hash[] = new int[max + 1];
        for(int i = 0; i < n; i++){
            hash[arr[i]]++;
        }
        for(int i = 0; i < max + 1; i++){
            if(hash[i] == 1) ans = i;
        }
        return ans;
    }
    static int findBetterUsingMap(int arr[]){
        int n = arr.length;
        int ans = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int num = arr[i]; 
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if (entry.getValue() == 1) {
            ans =  entry.getKey(); 
        }
    }
        return ans;
    }
    static int findOptimalUsingXOR(int arr[]){
        int xor = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++) xor = xor ^ arr[i];
        return xor;
    }
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 2, 5, 3, 3, 4, 4};
        System.out.println(findBruteUsingLinearSearch(arr));
        System.out.println(findBetterUsingHash(arr));
        System.out.println(findBetterUsingMap(arr));
        System.out.println(findOptimalUsingXOR(arr));
        
    }
}
