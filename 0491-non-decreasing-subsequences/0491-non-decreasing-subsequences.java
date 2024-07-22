class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        int n=nums.length;
        List<List<Integer>> subseq=new ArrayList<>();
        HashSet<List<Integer>> hs=new HashSet<>();
        for(int i=1;i<Math.pow(2,n);i++){
            
               List<Integer> s=(check(nums,n,i));
            if(s.size()>1){
                
                hs.add(s);
                
            }
        }
        subseq.addAll(hs);
        return subseq;
    }
    public List<Integer> check(int nums[],int n,int i){
        int prev=Integer.MIN_VALUE;
        List<Integer>sub=new ArrayList<>();
        for(int j=0;j<n;j++){
            if(((i>>j)&1) ==1){
                if(nums[j]>=prev){
                   sub.add(nums[j]); 
                    prev=nums[j];
                }
               
            }
        }
        return sub;
    }
}