class Solution {
    public int reverse(int x) {
      long rev=0;
        boolean isNegative=false;
    

        if(x<0) {
            isNegative=true;
            x = x * (-1);
        }
        
        while(x!=0) {
            rev = (rev*10) + (x % 10);
            x = x / 10; 
        }
        
        if(rev > 2147483647 || rev <= -2147483647)
            return 0;
        
        if(isNegative) {
            return (int)(rev *= (-1));
        }
        return (int)rev;
    }
}