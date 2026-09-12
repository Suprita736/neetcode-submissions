class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0,j = 0;
        while(i < word1.length() && j < word2.length()){
            word1 = word1.substring(0,i+1) + word2.charAt(j) + word1.substring(i+1);
            i += 2;
            j++;
        }
        if(j < word2.length()) word1 = word1 + word2.substring(j);
        return word1;
    }
}