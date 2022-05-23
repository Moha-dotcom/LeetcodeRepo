class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int  [ ] arr : image){
            invert(arr);
        }
     return image;
    }
    
    
    void invert(int [] arr){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int temp=1-arr[start]; // {1, 1, 0} = 0;
            arr[start]=1-arr[end]; // 1- 0; 1;
            arr[end] = temp;
            start++;
            end--;
            
        }
        
    }
}


