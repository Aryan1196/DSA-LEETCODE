class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missing_no = 0;
        int  n = arr.length;
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            missing_no = arr[mid] - (mid + 1);
            if(missing_no < k){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return start + k ;
    }
}