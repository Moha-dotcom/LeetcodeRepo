class Solution {
    public int[] shuffle(int[] nums, int n) {
       
       int shuffling[] = new int[2*n];
        int k = 0;
        
        for(int i = 0; i <shuffling.length; i+=2 )
        {
           shuffling[i] = nums[k];
            shuffling[i+1] = nums[k+n];
            k++;
        }
        
        return shuffling;
    }
}
