class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String num : operations){
            if(num.equals("--X")){
                --x;
            }
            else if(num.equals("X--")){
                x--;
            }
            else if(num.equals("++X")){
                ++x;
            }
            else if(num.equals("X++")){
                x++;
            }
        }
        return x;
    }
}