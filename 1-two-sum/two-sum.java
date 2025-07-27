class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] ans = new int[2];
        for(int i = 0 ; i < n ; i++){
            int num = nums[i];
            for(int j = 0 ; j < n ; j++){
                if(i!=j && num + nums[j] == target){
                    ans[0] = j ;
                    ans[1] = i ;
                }
            }
        }
        return ans;

    }
}