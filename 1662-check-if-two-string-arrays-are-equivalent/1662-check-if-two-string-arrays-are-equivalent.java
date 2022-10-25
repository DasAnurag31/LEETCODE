class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String one="",two="";
        for(String str : word1)
        {
            one+=str;
        }
        for(String str : word2)
        {
            two+=str;
        }
        return one.equals(two);
            
    }
}