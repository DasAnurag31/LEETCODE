class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int[] cache=new int[n+1];
        if(n==1)
            return cost[0];
        return Math.min(recurance(n-1,cache,cost),recurance(n-2,cache,cost));
    }
    public int recurance(int n, int[] cache,int[] cost)
    {
        if(n==0)
            return cost[0];
        if(n==1)
            return cost[1];
        else
        {
            if(cache[n]!=0)
            {
                return cache[n];
            }
            cache[n]=Math.min(recurance(n-1,cache,cost),recurance(n-2,cache,cost))+cost[n];
            return cache[n];
        }
    }
}