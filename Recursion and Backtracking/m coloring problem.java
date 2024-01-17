class Solution {
    public void helper(int n  , int openCount , int closeCount , String str ,List<String> result){
        if(n==0) {
            if(openCount==closeCount){
                result.add(str);
            }
            return;
        }
        
        //adding '('
        helper(n-1 , openCount+1 , closeCount , str+'(' , result);
        
        //adding ')'
        if(openCount>closeCount) helper(n-1 , openCount , closeCount+1 , str+')' , result);
    }
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(2*n , 0 , 0 ,"" , result);
        return result;
    }
}
