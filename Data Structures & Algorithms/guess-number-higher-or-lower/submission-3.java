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
        long i = 1,j = n;
        if(guess((int)j) == 0) return (int)j;
        if(guess((int)i) == 0) return (int)i;
        while(i <= j){
            long mid = (i+j)/2;
            if(guess((int)mid) == 0){
                return (int)mid;
            }
            else if(guess((int)mid) == -1){
                j = mid - 1;
            }
            else if(guess((int)mid) == 1){
                i = mid + 1;
            }
        }
        return 0;
    }
}