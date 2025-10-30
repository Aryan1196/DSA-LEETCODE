class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int[][] arr = new int[r][c];
        if(r*c != mat.length*mat[0].length){
            return mat;
        }
        int row = 0 ; int col = 0;
        for(int i =0 ; i<m ; i++){
            for(int j = 0 ; j < mat[i].length;j++){
                arr[row][col] = mat[i][j];
                col++;
                if(col == c){
                    col = 0;
                    row++;
                }
            }
        }
        
        return arr;
    }
}