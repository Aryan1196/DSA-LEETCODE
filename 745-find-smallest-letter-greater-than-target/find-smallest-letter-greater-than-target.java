class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0 , right = letters.length-1;
        while(left < right){
            int mid = left + (right - left)/2;
            int value = (int)target;
            if((int)letters[mid] > value){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return letters[left] > target ?letters[left]:letters[0];
    }
}