class Solution {
    public int countMatches(List<List<String>> items, String rulekey, String ruleValue) {
        int count = 0;
        if(rulekey.equals("type") ){
            for(int i =0 ; i<items.size();i++){
                if(items.get(i).get(0).equals(ruleValue)){
                    count++;
                }
            }
        }
        if(rulekey.equals("color") ){
            for(int i =0 ; i<items.size();i++){
                if(items.get(i).get(1).equals(ruleValue)){
                    count++;
                }
            }
        }
        if(rulekey.equals("name") ){
            for(int i =0 ; i<items.size();i++){
                if(items.get(i).get(2).equals(ruleValue)){
                    count++;
                }
            }
        }
        return count;
    }
}