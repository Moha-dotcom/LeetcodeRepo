class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                size=size+nums[i];
            }
        }
        
        int []res= new int [size];
        int cur=0;
        for(int i=0;i<nums.length-1;i+=2){
            for(int j=0;j<nums[i];j++){
                res[cur]=nums[i+1];
                cur++;
            }
        }return res;
        
    }
}

