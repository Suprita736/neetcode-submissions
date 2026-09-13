class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<>();
        String p = "";
        int i = 0;
        while(i < path.length()){
            if(path.charAt(i) == '/'){
                if(!s.isEmpty() && s.peek().equals("/")) {
                    i++;
                    continue;
                }
                else s.push(path.valueOf(path.charAt(i)));
                i++;
            }
            else if(path.charAt(i) == '.'){
                String dot = ".";
                i++;
                while(i < path.length() && path.charAt(i) != '/'){
                    dot += path.valueOf(path.charAt(i++));
                }
                if(dot.length() == 1) continue;
                else if(dot.length() == 2){
                    s.pop();
                    while(!s.isEmpty() && !s.peek().equals("/")) s.pop();
                }
                else s.push(dot);
            }
            else{
                String a = "";
                while(i < path.length() && path.charAt(i) != '/') a += path.valueOf(path.charAt(i++));
                s.push(a);
            }
        }
        if(!s.isEmpty() && s.peek().equals("/")) s.pop();
        if(s.isEmpty()) p = "/";
        else{
            while(!s.isEmpty()){
                p = s.pop() + p.substring(0);
            }
        }
        return p;
    }
}