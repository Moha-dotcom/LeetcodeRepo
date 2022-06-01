class Solution {
    public boolean isPalindrome(int x) {
       
        
        if(x >= 0){
            int sum = 0, n = x;
            while(x != 0){
                int a = x % 10;
                sum = sum * 10 + a;
                x /= 10;
            }
        
             boolean answer = sum == n ? true : false;
       
        
            return  answer;
            
        }else{
            return false;
        }
        
    }
}