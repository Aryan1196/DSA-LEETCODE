class Solution {
    public int largestAltitude(int[] gain) {
        int g = gain.length;
        int[] alt = new int[g+1];
        for(int i = 0 ; i < gain.length;i++){
            alt[i+1] = alt[i]+gain[i];
        }
        int max = 0;
        for(int num:alt){
            if(num>max){
                max = num;
            }
        }
        return max;
    }
}