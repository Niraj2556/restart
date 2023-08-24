import java.util.Arrays;
import java.util.Collections;

public class firstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {-1,7,8,9,1,12};


        System.out.println(firstPositive(arr));
    }

    public static int firstPositive(int[] nums){
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[i];
                nums[i] = nums[temp - 1];
                nums[temp - 1] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }

//    public static int[] bubbleSort(int[] arr) {
//        int n = arr.length;
//        int temp = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 1; j < (n - i); j++) {
//                if (arr[j - 1] > arr[j]) {
//                    //swap elements
//                    temp = arr[j - 1];
//                    arr[j - 1] = arr[j];
//                    arr[j] = temp;
//                }
//
//            }
//        }
//        return arr;
//    }
//
//        public static int missingPositive(int[] nums) {
//            bubbleSort(nums);
//
//        int len = nums.length;
//
//        int minusCount = 0;
//        for (int i = 0; i < len; i++) {
//            if (nums[i] < 0){
//                minusCount++;
//            }else {
//                break;
//            }
//
//        }
//        int k = 1;
////        here the initialization of "j" is wrong
//        for (int j = len-minusCount; j <= len; j++) {
//             if(nums[j] == k) k++;
//             else {
//                 return k;
//             }
//        }
//        return k;
//    }

}
