class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int cmp=target-nums[i];
            if(map.containsKey(cmp)){
                return new int[] { map.get(cmp),i};
            }
            map.put(nums[i],i);
        }
        int res[]=new int[2];
        return res;
    }
}