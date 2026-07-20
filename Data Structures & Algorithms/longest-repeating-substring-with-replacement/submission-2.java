class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int maxL = 0,maxV = 0,i = 0,j = 0;
        mp.put(s.charAt(0),1);
        while(j < s.length()){
            maxV = Collections.max(mp.values()); 
            if((j-i+1)-maxV <= k){
                maxL = Math.max(maxL,j-i+1);
                j++;
                if(j < s.length()) mp.put(s.charAt(j),mp.getOrDefault(s.charAt(j),0)+1);
            }
            else{
                if(mp.get(s.charAt(i)) == 1) mp.remove(s.charAt(i));
                else mp.put(s.charAt(i),mp.get(s.charAt(i))-1);
                i++;
            }
        }
        return maxL;
    }
}
