class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = (int)Math.floor(nums.length/3);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> it: map.entrySet()){
            if(it.getValue() > n){
                list.add(it.getKey());
            }
        }
        return list;
    }
}