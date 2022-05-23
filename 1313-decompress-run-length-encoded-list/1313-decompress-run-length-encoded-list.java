class Solution {
    public int[] decompressRLElist(int[] nums) {
        // To create new array we need to find the size
        int size=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                size=size+nums[i]; // We get the any even number an add it to the size
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

