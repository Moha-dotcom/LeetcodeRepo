class Solution {
    public int[] shuffle(int[] nums, int n) {
       
       int shuffled[] = new int[2*n];
        int k = 0;
        
        for(int i = 0; i <shuffled.length; i+=2 )
        {
           shuffled[i] = nums[k];
            shuffled[i+1] = nums[k+n];
            k++;
        }
        
        return shuffled;
    }
}
