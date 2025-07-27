class Solution {
    public int[][] transpose(int[][] matrix) {
        int x = matrix.length;
        int[][] ans = new int[matrix[0].length][x];
        for(int i = 0 ; i<x ;i++){
            for(int j = 0 ; j<matrix[i].length;j++){
                ans[j][i] = matrix[i][j];
            }
        }
        return ans;
    }
}