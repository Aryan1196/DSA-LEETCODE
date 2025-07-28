class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
         int col = matrix[0].length ; 
         int row = matrix.length ; 
         ArrayList <Integer> list = new ArrayList<>();
         for(int i = 0 ; i <row ; i++){
            int min = Integer.MAX_VALUE;
            int index = -1;
            for(int j = 0 ; j < col ;j++){
                if(matrix[i][j] < min){
                    min = matrix[i][j];
                    index = j;
                }
            }
            boolean islucky = true;
            for(int j = 0 ; j < row ;j++){
                if(matrix[j][index] > min){
                    islucky = false;
                }
                              
            }
            if(islucky){
                list.add(min);
            }
        }
       
        return list;
    }
}