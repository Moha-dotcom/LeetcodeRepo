class Solution {
    public boolean containsDuplicate(int[] nums) {
        
       Set<Integer> set = new HashSet<>();
      
        
        for(int i = 0; i< nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;

    }
}



//  int i = 0; 
//         int j  = 1;
        
//         while(i < nums.length){
//             while(j < nums.length){
//                 if(nums[i] == nums[j]) return true;
//                 j++;
                
//             }
            
//             i++;
//         }
        
//         return false;