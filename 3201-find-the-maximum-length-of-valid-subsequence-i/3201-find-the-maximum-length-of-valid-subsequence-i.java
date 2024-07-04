class Solution {
    public int maximumLength(int[] nums) {
       int f=-1;
        int ec=0;
       int oc=0;
        int ac=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ec++;
                if(f!=0){
                    ac++;
                    f=0;
                }
            }
            else{
                oc++;
                if(f!=1){
                    ac++;
                    f=1;
                }
            }
        }
        int x= Math.max(ac,oc);
        int y=Math.max(ac,ec);
        return Math.max(x,y);
    }
}