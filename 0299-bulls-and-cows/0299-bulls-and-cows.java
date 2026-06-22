class Solution {
    public String getHint(String secret, String guess) {
        int bulls=0,cows=0;
        for(int i=0;i<secret.length();i++) {
            if(secret.charAt(i)==guess.charAt(i)) {
                bulls++;
            }
        }
        for(char ch='0';ch<='9';ch++) {
            int sCount=0,gCount=0;
            for(int i=0;i<guess.length();i++) {
                if(secret.charAt(i)==ch) 
                    sCount++;
                if(guess.charAt(i)==ch) 
                    gCount++;    
            }
                cows+=Math.min(sCount,gCount);
        }
        cows=cows-bulls;
        return bulls + "A" + cows + "B";
    }
}