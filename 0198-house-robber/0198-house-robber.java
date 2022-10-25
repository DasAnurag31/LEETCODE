class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] cache=new int[n+1];
        Arrays.fill(cache,-1);
        return recurance(n-1,nums,cache);
    }
    public int recurance(int index, int[] nums,int[] cache)
    {
        if(index<0)
            return 0;
        if(index==0)
            return nums[index];
        if(cache[index]!=-1)
            return cache[index];
        int pick=nums[index]+recurance(index-2, nums,cache);
        int notpick=0+recurance(index-1,nums,cache);
        return cache[index]=Math.max(pick, notpick);
    }
}