class Solution {
    public int minimumCost(int m, int n, int[] hcut, int[] vcut) {
        Arrays.sort(hcut);
        Arrays.sort(vcut);
        int p1=m-2;
        int p2=n-2;
        int v=1;
        int h=1;
        int res=0;
        while(p1>=0 && p2>=0){
            if(hcut[p1]>vcut[p2]){
                res+=hcut[p1]*v;
                h++;
                p1--;
            }
            else{
                res+=vcut[p2]*h;
                v++;
                p2--;
            }
        }
        while(p1>=0){
              res+=hcut[p1]*v;
                h++;
                p1--; 
            //res+=hcut[p1]*v;
               
        }
        while(p2>=0){
              res+=vcut[p2]*h;
                v++;
                p2--;
        }
        return res;
    }
}