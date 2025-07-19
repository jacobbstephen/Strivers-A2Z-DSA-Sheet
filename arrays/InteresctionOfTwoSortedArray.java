
import java.util.ArrayList;
import java.util.List;

public class InteresctionOfTwoSortedArray {
    static int[] intersectionOptimise(int[] arr1, int[] arr2){
        List<Integer> list =  new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;
        while(i < n1 && j < n2){
            if(arr1[i] < arr2[j])  i++;
            else if(arr1[i] > arr2[j]) j++;
            else{
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        int[] result = new int[list.size()];
        for(int k = 0; k < list.size(); k++){
            result[k] = list.get(k);
        }


        return result;
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3, 3, 4, 5, 6};
        int arr2[] = {2, 3, 3, 5, 6, 6, 7};
        int result [] = intersectionOptimise(arr1, arr2);
        for(int li: result){
            System.out.print(li + " ");
        }
    }
}
