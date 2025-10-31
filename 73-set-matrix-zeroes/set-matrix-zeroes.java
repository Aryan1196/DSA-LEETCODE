class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int[] markRow = new int[m];
        int[] markCol = new int[n];
        for(int i =0 ; i < m ; i++){
            for(int j =0 ; j < n ;j++){
                if(matrix[i][j] == 0){
                    markRow[i] = 1;
                    markCol[j] = 1;
                }
            }
        }
        for(int i =0 ; i < m ; i++){
            for(int j =0 ; j < n ;j++){
                if(markRow[i]== 1 || markCol[j] == 1){
                    matrix[i][j] = 0;
                }
                
            }
        }
    }
}