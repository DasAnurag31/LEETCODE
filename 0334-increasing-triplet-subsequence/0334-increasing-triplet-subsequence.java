class Solution { 
    public boolean increasingTriplet(int[] nums) {
       // for(int i=0;i<nums.length-2;i++)
       // {
       //     for(int j=i+1;j<nums.length-1;j++)
       //     {
       //         for(int k=j+1;k<nums.length;k++)
       //         {
       //             if(nums[k]> nums[j] && nums[j]>nums[i])
       //                 return true;
       //         }
       //     }
       // }
       //  return false;
        
        // int start=0;
        // int end=start+2;
        // while(end<nums.length)
        // {
        //     if(nums[start]<nums[start+1] && nums[start+1]<nums[end])
        //         return true;
        //     start++;
        //     end++;
        // }
        // return false;
        
         int max1 = Integer.MAX_VALUE;
       int max2 = Integer.MAX_VALUE;
       for(int n : nums) {
           if(n <= max1) max1 = n;
           else if(n <= max2) max2 = n;
           else return true;
       }
       return false;
    }
}