package leetcode;


import org.junit.jupiter.api.Test;

class TwoSumTest {
    private TwoSum twoSum = new TwoSum();

    @Test
    public void test() throws Exception {
        int[] nums = {0, 1, 2, 5, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }

}