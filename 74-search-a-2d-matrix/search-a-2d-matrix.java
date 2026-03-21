class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int start = 0;
        int end = n - 1;
        int row = -1;
        while(start <= end ){
            int mid = start + (end - start)/2;
            if(target >= matrix[mid][0] && target <= matrix[mid][m-1]){
                row = mid;
                break;
            }
            else if(target < matrix[mid][0]){
                end = mid - 1;
            }
            else if(target > matrix[mid][m-1]){
                start = mid + 1;
            }
        }
        if(row == -1) return false;
        int left = 0 , right = m-1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(matrix[row][mid] == target){
                return true;
            }
            else if(matrix[row][mid] < target){
                left = mid + 1;
            }
            else if(matrix[row][mid] > target){
                right = mid - 1;
            }
        }
        return false;
    }
}