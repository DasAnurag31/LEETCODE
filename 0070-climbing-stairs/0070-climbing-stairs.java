class Solution {
    public int climbStairs(int n) {
        int[] cache=new int[n+1];
        int ns=0;
        return recurance(n,cache,ns);
    }
    public int recurance(int n,int[] cache,int ns)
    {
        if(n<2)
        {
            ns++;
            return ns;
        }
        else
        {
            if(cache[n]!=0)
            {
                return cache[n];
            }
            cache[n]= recurance(n-1,cache,ns)+recurance(n-2,cache,ns);
            return cache[n];
        }
    }
}