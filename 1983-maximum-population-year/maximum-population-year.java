class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];
        for(int i =0 ; i<logs.length ; i++){
            int birth = logs[i][0];
            int death = logs[i][1];

            if(birth > 1950){
                years[birth - 1950] += 1;
            }
            if(death < 2050){
                years[death - 1950]+=-1;
            }
        }
        int max = 0 ; int current = 0 ; int res = 0 ; 
        for(int i = 0 ; i < years.length ; i++){
            current += years[i];
            years[i] = current ;
            if(current > max){
                max = current;
                res = i ;
            }
        }
        
        return res+1950  ;
    }
}