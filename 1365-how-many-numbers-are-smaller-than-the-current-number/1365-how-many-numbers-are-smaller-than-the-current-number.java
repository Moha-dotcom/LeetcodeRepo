class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int [] smaller = new int[nums.length];
        
        int count;
        
        for(int i = 0; i < nums.length; i++){
            count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] > nums[j]){
                    count++;
                }
                
            }
            
            smaller[i] = count;
        }
        
        return smaller;
        
    }
}