class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] arr = new int[101];
        for (int i =0 ; i < logs.length  ; i++){
            arr[logs[i][0] - 1950]++;
            arr[logs[i][1] - 1950] --;
        }
        int max = 0;
        int j = 0;
        int current = 0;
        for(int i = 0 ; i < arr.length ;i++){
            current += arr[i];
            arr[i] = current;

            if(arr[i] > max){
                max = arr[i];
                j = i;
            }
        }
        return j + 1950;
    }
}