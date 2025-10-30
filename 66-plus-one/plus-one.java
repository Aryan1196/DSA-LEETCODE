class Solution {
    public int[] plusOne(int[] digits) {
        int d  = digits.length;
         for(int i = d-1 ; i >= 0; i--){
            if(digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
         }
        digits = new int[d+1];
        digits[0] = 1;
        
        return digits;
    }
}