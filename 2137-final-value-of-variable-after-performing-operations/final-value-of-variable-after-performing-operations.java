class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String num : operations){
            if(num.charAt(0) == '+'|| num.charAt(num.length()-1) == '+'){
                ++x;
            }
            else{
                --x;
            }
        }
        return x;
    }
}