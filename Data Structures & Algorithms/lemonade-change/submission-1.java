class Solution {
    public boolean lemonadeChange(int[] bills) {
        int ten = 0,twenty = 0,five = 0;
        for(int i = 0;i < bills.length;i++){
            if(bills[i] == 5) five += 5;
            else if(bills[i] == 10){
                if(five >= 5) {
                    five -= 5;
                    ten += 10;
                }
                else return false;
            }
            else if(bills[i] == 20){
                if(ten >= 10 && five >= 5) {
                    ten -= 10;
                    five -= 5;
                    twenty += 20;
                }
                else if(five >= 15){
                    five -= 15;
                    twenty += 20;
                }
                else return false;
            }
        }
        return true;
    }
}