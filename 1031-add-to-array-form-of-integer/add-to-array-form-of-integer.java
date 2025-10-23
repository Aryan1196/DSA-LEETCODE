class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int m =num.length;
        for(int i = m-1 ; i >=0 || k>0 ;i--){
            if(i>=0){
                k = num[i]+k;
            }
            list.add(0,k%10);
            k = k/10;
        }
        // Collections.reverse(list);
        
        
        return list;
        
    }
}

