class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i=0,j=0,max = Integer.MIN_VALUE;
        if(s.length() == 0) return 0;
        String st = "";
        HashSet<Character> mp = new HashSet<Character>();
        while(i < s.length() && j < s.length()){
            mp = new HashSet<>();
            while(j < s.length() && !mp.contains(s.charAt(j))){
              mp.add(s.charAt(j));
              st = s.substring(i,j+1);
              j++;
            }
            max = Math.max(max, st.length());
            i++;
            j = i;
            st = "";
        }
        return max;
    }
}
