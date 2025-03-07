// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int destination = nums.length-1;
        for (int i = n-2;i>=0;i--) {
            if (nums[i] + i >= destination){
                destination = i;
            }
        }
        if (destination == 0) {
            return true;
        }
        return false;
        
    }
}
