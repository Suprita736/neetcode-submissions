class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,max = Integer.MIN_VALUE;
        if(s.length() == 0) return 0;
        HashSet<Character> mp = new HashSet<Character>();
        while(i < s.length() && j < s.length()){
            while(j < s.length() && !mp.contains(s.charAt(j))){
              mp.add(s.charAt(j));
              j++;
            }
            max = Math.max(max, j - i );
            mp.remove(s.charAt(i));
            i++;
            
        }
        return max;
    }
}
