/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1;
        int right = n;
        while(left<=right){
            int mid = right + (left-right)/2;
            int ges = guess(mid);
            if(ges == 0){
                return mid;
            }
            else if(ges == -1){
                right = mid - 1 ;
            }
            else {
                left = mid + 1;;
            }
        }
        return 0;
    }
}