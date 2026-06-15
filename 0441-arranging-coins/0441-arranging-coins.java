class Solution {
    public int arrangeCoins(int n) {
        int row=0;
        for(int i=1;n>=i;i++) {
            n-=i;
            row++;
        }
        return row;
    }
}