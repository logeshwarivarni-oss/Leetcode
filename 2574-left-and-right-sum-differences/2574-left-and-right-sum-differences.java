class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int totalsum=0;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            totalsum+=nums[i];
        }
        int leftsum=0;
        for(int i=0;i<n;i++){
            totalsum-=nums[i];
            ans[i]=Math.abs(leftsum-totalsum);
            leftsum+=nums[i];
        }
        return ans;
    }
}