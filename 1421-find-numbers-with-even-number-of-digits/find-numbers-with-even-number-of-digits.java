class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(((int)(Math.log10(nums[i]))+1)%2==0){
                count++;
            }
        }
        return count;
    }
    //boolean even(int digit){
        // int count=0;
        // while(digit>0){
        //     digit = digit/10;
        //     count++;
        // }
        //return ((int)(Math.log10(digit))+1)%2==0;
    //}
}