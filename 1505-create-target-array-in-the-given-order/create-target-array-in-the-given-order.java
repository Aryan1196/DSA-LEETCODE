class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];
        for(int i =0 ; i  < n ;i++){
            int indx = index[i];
            for(int j = n-1 ; j > indx;j--){
                target[j] = target[j-1];
            }
            target[indx] = nums[i];
        }
        return target;
    }
}