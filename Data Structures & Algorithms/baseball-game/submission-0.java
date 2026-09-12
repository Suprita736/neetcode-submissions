class Solution {
    public int calPoints(String[] o) {
        int a = Integer.MAX_VALUE,b = Integer.MAX_VALUE;
        Stack<Integer> s = new Stack<>();
        for(int i = 0;i < o.length;i++){
            if(o[i].equals("C")){
                s.pop();
                if(s.size() > 1){
                    b = s.pop();
                    a = s.peek();
                    s.push(b);
                }
                else
                    b = Integer.MAX_VALUE;
            }
            else if(o[i].equals("D")){
                a = s.peek();
                b = 2 * a;
                s.push(b);
            }
            else if(o[i].equals("+")){
                b = a + b;
                a = s.peek();
                s.push(b);
            }
            else {
                if(a == Integer.MAX_VALUE) {
                    a = Integer.parseInt(o[i]);
                    s.push(a);
                }
                else if(b == Integer.MAX_VALUE){
                    b = Integer.parseInt(o[i]);
                    s.push(b);
                }
                else {
                    a = s.peek();
                    b = Integer.parseInt(o[i]);
                    s.push(b);
                }
            }
        }
        int sum = 0;
        while(!s.isEmpty()){
            sum += s.pop();
        }
        return sum;
    }
}