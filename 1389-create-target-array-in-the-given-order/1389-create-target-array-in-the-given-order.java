class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        
        if(nums.length == 1 ) return nums;
        
        int target [] = new int [nums.length];
        List<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
             // insert at index[i] the value of nums[i] in the target array
            list.add(index[i], nums[i]);
        }
        
        
        
       
    
        for(int  j= 0 ; j < nums.length; j++){
            target[j] = list.get(j);
        }
        
        return target;
        
    }
}

