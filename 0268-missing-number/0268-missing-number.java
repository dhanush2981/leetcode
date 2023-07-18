class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int result=0;
        for(int i=0;i<nums.length;i++){
            result^=nums[i];
        }
        for(int i=0;i<=n;i++){
            result^=i;
        }
        return result;
    }
}