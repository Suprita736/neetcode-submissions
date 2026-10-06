class Solution {
    public String addBinary(String a, String b) {
        int c = 0,i = a.length()-1,j = b.length()-1,sum = 0;
        String s = "";
        while(i >= 0 && j >= 0){
            sum = c + (a.charAt(i) - '0') + (b.charAt(j) - '0');
            if(sum == 0){
                s = "0" + s.substring(0);
                c = 0;
            }
            else if(sum == 1){
                s = "1" + s.substring(0);
                c = 0;
            }
            else if(sum == 2){
                s = "0" + s.substring(0);
                c = 1;
            }
            else if(sum == 3){
                s = "1" + s.substring(0);
                c = 1;
            }
            i--;
            j--;
        }
        if(i >= 0){
            while(i >= 0){
                sum = c + (a.charAt(i) - '0');
                if(sum == 0){
                s = "0" + s.substring(0);
                c = 0;
                }
            else if(sum == 1){
                s = "1" + s.substring(0);
                c = 0;
                }
            else if(sum == 2){
                s = "0" + s.substring(0);
                c = 1;
                }
                i--;
            }
        }
        if(j >= 0){
            while(j >= 0){
                sum = c + (b.charAt(j) - '0');
                if(sum == 0){
                s = "0" + s.substring(0);
                c = 0;
                }
            else if(sum == 1){
                s = "1" + s.substring(0);
                c = 0;
                }
            else if(sum == 2){
                s = "0" + s.substring(0);
                c = 1;
                }
                j--;
            }
        }
        if(c == 1) s = "1" + s.substring(0);
        return s;
    }
}