import java.util.*;

class Solution {

    public boolean areOccurrencesEqual(String s) {

        HashMap<Character,Integer> map = new HashMap<>();

        // Count frequency
        for(char ch : s.toCharArray()){

            map.put(ch,map.getOrDefault(ch,0)+1);

        }

        int freq = -1;

        // Compare frequencies
        for(Map.Entry<Character,Integer> entry : map.entrySet()){

            if(freq == -1){

                freq = entry.getValue();

            }
            else if(freq != entry.getValue()){

                return false;

            }
        }

        return true;
    }
}