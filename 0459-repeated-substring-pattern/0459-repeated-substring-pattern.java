class Solution {
    public boolean repeatedSubstringPattern(String s) {
        String str=s+s;
        boolean res=str.substring(1,str.length()-1).contains(s);
        return res;
        
    }
}