class Solution {
    private void combination(int index,int target,List<List<Integer>> ans, ArrayList<Integer> list,int[] array)
    {
        if(index==array.length)
        {
            if(target==0)
            ans.add(new ArrayList(list));
            
            return;
        }
        
        if(array[index]<=target)
        {
            list.add(array[index]);
            combination(index,target-array[index],ans,list,array);
            list.remove(list.size()-1);
        }
        combination(index+1,target,ans,list,array);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> list=new ArrayList<>();
        combination(0,target,ans,list,candidates);
        return ans;
    }
}