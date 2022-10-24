class Solution {
    public int tribonacci(int n) {
        int[] cache=new int[n+1];
        return recurance(n,cache);
    }
    public int recurance(int n,int[] cache)
    {
        if(n==0)
            return 0;
        if(n<3)
            return 1;
        else
        {
            if(cache[n]!=0)
            {
                return cache[n];
            }
            cache[n]=recurance(n-1,cache)+recurance(n-2,cache)+recurance(n-3,cache);
            return cache[n];
        }
    }
}