class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];
        if(n%2 != 0){
            arr[0] = 0;
            for(int i = 1; i <= (n/2) ; i++ ){
                arr[i] = i;
                arr[n-i] = -i;
            }
        }else{
            for(int i = 0 ; i <= n/2 ; i++ ){
                arr[i] = i+1;
                arr[n-i-1] = -(i+1);
            }
        }
        return arr;
    }
}