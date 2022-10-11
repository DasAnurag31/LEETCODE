class Solution { 
    public boolean increasingTriplet(int[] nums) {
        int smallest=Integer.MAX_VALUE;
        int small=Integer.MAX_VALUE;
        for(int n:nums)
        {
            if(n<=smallest)
                smallest=n;
            else if(n<=small)
                small=n;
            else
                return true;
        }
        return false;
    }
}