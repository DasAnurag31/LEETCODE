class Solution {
    public int isApplicable(String res){
        int[] cnt = new int[26];
        for(int i = 0 ; i < res.length() ; i++)
            cnt[res.charAt(i) - 'a']++;
        for(int i = 0 ; i < 26 ; i++)
            if(cnt[i] > 1) return 0;
        return res.length();
    }
    public int solve(List<String> arr , int idx, String res){
        if(idx == arr.size()){
            return isApplicable(res); // see if the string is valid i.e unique
        }
        
        int len  = res.length();
        
        res += (arr.get(idx)); // take
        int size1 = solve(arr , idx + 1 , res);
        res=res.substring(0,len); //not take
        int size2 = solve(arr , idx + 1 , res);
        
        return Math.max(size1, size2); // claculate the maximum of subsequences max(left,right)
    }
    
    public int maxLength(List<String> arr) {
        return solve(arr , 0 ,"");
    }
}