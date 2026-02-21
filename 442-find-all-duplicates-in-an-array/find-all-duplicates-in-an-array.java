import java.util.*;

class Solution {

    public List<Integer> findDuplicates(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){

            map.put(num, map.getOrDefault(num,0) + 1);
        }

        List<Integer> list = new ArrayList<>();

        for(Map.Entry<Integer,Integer> it : map.entrySet()){

            if(it.getValue() > 1){

                list.add(it.getKey());
            }
        }

        return list;
    }
}