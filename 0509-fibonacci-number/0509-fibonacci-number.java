class Solution {
    public int fib(int n) {
        int[] cache=new int[n+1];
        return recurance(n,cache);
    }
    public int recurance(int n,int[] cache)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        else
        {
            if(cache[n]!=0)
                return recurance(n-1,cache)+recurance(n-2,cache);
            cache[n]=recurance(n-1,cache)+recurance(n-2,cache);
            return recurance(n-1,cache)+recurance(n-2,cache);
        }
    }
}