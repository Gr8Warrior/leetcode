package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
{@link 'https://leetcode.com/problems/two-sum/'
 */
class TwoSum {

    public static void main(String[] args) {
        int array[] = { 2, 7, 11, 15 };
        int target = 26;
        int result[] = twoSum(array, target);
        System.out.println(result[0] + " " + result[1]);

    }
 
    /** 
     * @param nums
     * @param target
     * @return int[]
     */
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(target - nums[i])) {
                int temp[] = { (Integer) map.get(target - nums[i]), i };
                return temp;
            }
            map.put(nums[i], i);
        }
        return nums;
    }
}