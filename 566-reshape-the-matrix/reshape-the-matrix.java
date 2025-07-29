class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int [][] arr = new int[r][c];
        if(mat[0].length * mat.length != r*c){
            return mat;
        }
        int row = 0 ;
        int col = 0 ;
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[i].length ; j++){
                arr[row][col] = mat[i][j];
                col++;
                if(col == c){
                    row++;
                    col = 0 ;
                }
            }
        }
        return arr;
        
    }
}