class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        String[] s = new String[strs.length];
        List<List<String>> l = new ArrayList<>();
        int count = 0;
        for(int i=0;i<strs.length;i++){
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String ss = new String(c);
            s[i] = ss;
        }
        for(int j=0;j<s.length;j++){
            if(s[j] != "."){
            l.add(new ArrayList<>());
            l.get(count).add(strs[j]);
                for(int i=j+1;i<s.length;i++){
                    if(s[i].equals(s[j])){
                        l.get(count).add(strs[i]);
                        s[i] = ".";
                    }
                }
                count++;
            }
        }
        return l;
    }
}
