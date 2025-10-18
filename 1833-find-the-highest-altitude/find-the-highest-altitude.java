class Solution {
    public int largestAltitude(int[] gain) {
        int g = gain.length;
        int[] altitude = new int[g+1];
        for(int i = 0 ; i < gain.length ;i++){
            altitude[i+1] = altitude[i]+gain[i];
        }
        int Max = 0;
        for(int num : altitude){
            if(num>Max){
                Max = num;
            }
        }
        return Max;
    }
}