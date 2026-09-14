class Solution {
    public String decodeString(String s) {
        Stack<String> st = new Stack<>();
        Stack<Integer> n = new Stack<>();
        int i = 0;
        while(i < s.length()){
            if(s.charAt(i) == '['){
                st.push(String.valueOf(s.charAt(i++)));
            }
            else if(s.charAt(i) == ']'){
                String a = "";
                while(!st.peek().equals("[")){
                    a = st.pop() + a.substring(0);
                }
                st.pop();
                st.push(a.repeat(n.pop()));
                i++;
            }
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                String a = "";
                while(i < s.length() && Character.isLetter(s.charAt(i))) {
                    a += String.valueOf(s.charAt(i++));
                }
                st.push(a);
            }
            else{
                int digit = 10,power = 1;
                int num = Character.getNumericValue(s.charAt(i++));
                while(Character.isDigit(s.charAt(i))){
                    num = (num * 10)+ Character.getNumericValue(s.charAt(i++));
                }
                n.push(num);
            }
        }
        String a = "";
        if(!st.isEmpty()){
            a = st.pop();
            while(!st.isEmpty()){
                a = st.pop() + a.substring(0);
            }
        }
        return a;
    }
}