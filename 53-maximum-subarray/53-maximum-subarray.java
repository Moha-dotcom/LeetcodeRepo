class Solution {
    public int maxSubArray(int[] nums) {
        
        
        
        int prevnum = nums[0];
        int max = nums[0];
        
        for(int i = 1; i < nums.length; i++){
           int curr = Math.max(prevnum + nums[i], nums[i]);
            max = Math.max(max, curr);
            prevnum = curr;
        }    
         return max;
        
    }

}