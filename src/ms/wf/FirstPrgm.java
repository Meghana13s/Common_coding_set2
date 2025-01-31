package ms.wf;

import java.util.Arrays;
import java.util.HashMap;

public class FirstPrgm {
    public static int[] find(int[] arr, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i < arr.length;i++) {
            int complement = target - arr[i];
            if(hm.containsKey(complement)) {
                 return new int[] {complement,arr[i]};
            }
            hm.put(arr[i],i);
        }
        return null;
    }
    public static void main(String[] args) {
        int arr[] = {0, -1, 2, -3, 1};
        int target = -4;
        int[] intss = find(arr, target);
        System.out.println(Arrays.toString(intss)); // 1,-3





//        int arrr[] = {0,2,3,4,5};  // ans : 2,4  1,3
//        int targets = 6;

//        int[] ints = find(arrr, targets);

//        System.out.println(Arrays.toString(ints));



    }
}
