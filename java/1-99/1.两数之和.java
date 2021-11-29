/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 *  Solutions: 1. HashMap 2. Sort + Double Pointer
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[]{-1, -1};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                ans[0] = i;
                ans[1] = map.get(target - nums[i]);
                return ans;
            }
            map.put(nums[i], i);
        }

        return ans;
    }
}
// @lc code=end

