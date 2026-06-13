class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String ans="";
        for(int i=0;i<words.length;i++) {
            int sum=0;
            for(int j=0;j<words[i].length();j++) {
                char ch=words[i].charAt(j);
                sum+=weights[ch-'a'];
            }
            int mod=sum % 26;
            ans+=(char)('z'-mod);
        }
        return ans;
    }
}