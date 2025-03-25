// TC: O(n)
// SC: O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null) return 0;
        int n = nums.length;

        int max = nums[0];
        int rSum = nums[0];
        for(int i = 1; i < n; i++){
            rSum = rSum + nums[i];
            if(nums[i] > rSum){
                rSum = nums[i];
            }
            max = Math.max(max, rSum);
        }
        return max;
    }
}
