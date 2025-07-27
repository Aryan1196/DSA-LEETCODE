class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0 ;
        if(n == 1){
            return mat[0][0];
        }
        if(n%2 == 0){
            for(int i =0 ; i < n ;i++){
                for(int j = 0 ; j < n ; j++){
                    if(i == j){
                        sum+=mat[i][j];
                    }
                }
                for(int j = n -1 ; j>0 ; j++){
                    sum+= mat[i][n-1-i];
                    break;
                }
            }
        }
        if(n%2!=0){
            for(int i =0 ; i < n ;i++){
                for(int j = 0 ; j < n ; j++){
                    if(i == j){
                        sum+=mat[i][j];
                    }
                }
                for(int j = n -1 ; j>0 ; j++){
                    sum+= mat[i][n-1-i];
                    break;
                }
            }
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
}