class Solution {
    public String removeDuplicateLetters(String s) {
        int[]lastPos = new int[26];
        boolean[] considered = new boolean[26];
        for(int i=0 ;i<s.length() ;i++) lastPos[s.charAt(i)-'a']=i;
        Stack<Character> stack = new Stack<>();
        
        for(int i=0 ;i<s.length(); i++){
            char curr = s.charAt(i);
             if(considered[curr-'a']) continue;
             
            while(!stack.isEmpty() && stack.peek()>curr && lastPos[stack.peek()-'a'] >i ){
                char ch = stack.pop();
                considered[ch-'a']=false;
            }
            
            considered[curr-'a']=true;
            stack.push(curr);
         }
        
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) sb.append(stack.pop());
        
        return sb.reverse().toString();
    }
}
