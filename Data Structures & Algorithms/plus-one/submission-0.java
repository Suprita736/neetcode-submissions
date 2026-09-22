class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length-1;
        if(digits[i] == 9){
            while(digits[i] == 9){
                digits[i] = 0;
                if(i == 0){
                    digits = new int[digits.length+1];
                    digits[0] = 1;
                    return digits;
                }
                else {
                    i--;
                }
            }
            digits[i] += 1;
        }
        else {
            digits[i] += 1;
        }
        return digits;
    }
}
