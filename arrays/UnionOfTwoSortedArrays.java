
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UnionOfTwoSortedArrays {
    static List<Integer> unionBrute(int arr1[] , int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < n1; i++) set.add(arr1[i]);
        for(int i = 0; i < n2; i++) set.add(arr2[i]);
        for(Integer elem: set){
            list.add(elem);
        }

        return list;
    }

    static List<Integer> unionOptimise(int arr1[] , int arr2[]){
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while(i < n1 && j < n2){
            if(arr1[i] <= arr2[j]){
                if(list.isEmpty() || list.get(list.size() - 1) != arr1[i]){
                    list.add(arr1[i]);
                }
                i++;
            }else{
                if(list.isEmpty() || list.get(list.size() - 1) != arr2[j]){
                    list.add(arr2[j]);
                }
                j++;
            }
        }
        while(i < n1){
            if(list.isEmpty() || list.get(list.size() - 1) != arr1[i]){
                list.add(arr1[i]);
            }
            i++;
        }
        while(j < n2){
            if(list.isEmpty() || list.get(list.size() - 1) != arr2[j]){
                list.add(arr2[j]);
            }
            j++;
        }
        
        return list;
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 2, 3, 3, 4, 5, 6};
        int arr2[] = {1, 2, 3, 3, 5, 6, 6, 7};
        List<Integer> list = unionOptimise(arr1, arr2);
        for(Integer li: list){
            System.out.print(li + " ");
        }

    }
}
