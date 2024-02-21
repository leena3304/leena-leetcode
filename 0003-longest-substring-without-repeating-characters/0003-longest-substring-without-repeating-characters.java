class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lsl=0;
        for(int i=0;i<s.length();i++)
        {
            boolean[] visited=new boolean[200];
            for(int j=i;j<s.length();j++)
            {
             if(visited[s.charAt(j)]== true)
             {
                 break;
             }
             else{
                 lsl=Math.max(lsl,j-i+1);
                 visited[s.charAt(j)] = true;
             }
            }
            visited[s.charAt(i)]=false;
        }
        return lsl;
        
    }
}