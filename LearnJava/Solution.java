package LearnJava;

import java.util.ArrayList;



public class Solution {

    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();

        int start = 0, sum = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];

            // Debug breakpoint suggestion:
            // Watch: start, end, sum
            while (sum > target && start <= end) {
                sum -= arr[start];
                start++;
            }

            if (sum == target) {
                result.add(start + 1); // 1-based index
                result.add(end + 1);
                return result;
            }
        }

        result.add(-1);
        return result;
    }

    public static void main(String[] args) {
        // Test input
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;

        ArrayList<Integer> ans = subarraySum(arr, target);

        // Output
        System.out.println(ans);
    }
}


    

