class Solution {
    public int divide(int dividend, int divisor) {
        double div = dividend / divisor;
        if(dividend < 0 && divisor > 0){
            return (int) (Math.floor(div));
        }else if(dividend > 0  && divisor < 0){
             return (int) (Math.floor(div)); 
        }else{
             return (int) Math.abs(Math.floor(div)); 
        }
    }
}