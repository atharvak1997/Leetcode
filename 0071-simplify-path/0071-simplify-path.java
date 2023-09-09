class Solution {
    public String simplifyPath(String path) {
        String[] str = path.split("/");
        Stack<String> stack= new Stack<>();
        
        for(String s : str) {
            if(s.equals("") || s.equals(".")) continue;
            else if(s.equals("..")) {if(!stack.isEmpty()) stack.pop();}
            else stack.push(s);
        }
        
        Collections.reverse(stack);
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
            sb.append("/");
            sb.append(stack.pop());
        }
        
        if(sb.length()==0) return "/";
        return sb.toString();
    }
}