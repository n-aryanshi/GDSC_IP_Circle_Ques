class Solution {
    public String toLowerCase(String s) {
        char[] str = s.toCharArray();
        for(int i=0 ;i<str.length ;i++){
            if(str[i]>='A' && str[i]<='Z') {  //Upper case character
                // str[i] = (char) ((str[i]-'A' ) +'a');
                str[i] = (char) ((int) str[i] +32);
            }
        }
        return new String(str);
    }
}
