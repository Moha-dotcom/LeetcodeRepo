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
            int temp = 1-arr[start];
            arr[start] = 1-arr[end];
             arr[end]=temp;
            start++;
            end--;
            
        }
        
    }
}


