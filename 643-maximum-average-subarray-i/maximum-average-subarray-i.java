class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        double max_sum = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0 ; i < k ; i++){
            sum += nums[i];
        }
        max_sum = sum;
        for(int j = k; j < n ; j++){
            sum -= nums[j-k];
            sum += nums[j];
            max_sum = Math.max(sum,max_sum); 
        }
        return max_sum/k;
    }
}