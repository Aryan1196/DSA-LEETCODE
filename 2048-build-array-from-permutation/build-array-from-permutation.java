class Solution {
    public int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];
        int[] temp = new int[nums.length];
        for(int i = 0;i < nums.length;i++){
            temp[i] = nums[i];
        }
        for(int i = 0;i < nums.length;i++){
            arr[i] = nums[temp[i]];
        }
        return arr;
    }
}