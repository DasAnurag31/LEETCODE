Dynamic Programming similar to fibonacci
* twist is that you count the no of individual leafs instead of calculating the sum
* so you calcaulate normaly as in fibonacci
* but when u reach the leaf or the base condition, instead of returning 1 or 0 count that you have reahced a leaf and return counter
​
code:
```
class Solution {
public int climbStairs(int n) {
int[] cache=new int[n+1];
int ns=0; // no of steps
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
```