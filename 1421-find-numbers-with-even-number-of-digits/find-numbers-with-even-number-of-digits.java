class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int[] ans = new int[nums.length];
        for(int i =0 ;i < nums.length ; i++){
            String s = "" + nums[i] ;
            ans[i] = s.strip().length();
            if(ans[i] % 2 == 0){
                count++;
            }
        }
        
            
        
        return count;
    }
}