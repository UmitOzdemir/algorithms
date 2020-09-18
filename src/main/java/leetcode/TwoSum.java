package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map numbersAndOrders = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            numbersAndOrders.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int secondInt = target - nums[i];
            int secondId = (int) numbersAndOrders.getOrDefault(secondInt, -1);
            if (secondId >= 0 && secondId != i) {
                int[] result = {i, secondId};
                return result;
            }
        }

        return null;
    }
}
