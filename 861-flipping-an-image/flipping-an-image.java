class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int [][] rev = new int[image[0].length][image.length];
        for(int i=0; i<image.length; i++){
            int k=0;
            for(int j=image[i].length-1; j>=0; j--){
                rev[i][k++] = image[i][j]^1;
            }
        }
        
        return rev;
    }
}