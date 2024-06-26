class Solution {
    public int minimumArea(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int fr=Integer.MAX_VALUE;    //first row where 1 is encountered
        int lr=Integer.MIN_VALUE;    //last row where 1 is encounterd
        int fc=Integer.MAX_VALUE;
        int lc=Integer.MIN_VALUE;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==1){
                    fr=Math.min(i,fr);
                    lr=Math.max(i,lr);
                    fc=Math.min(j,fc);
                    lc=Math.max(j,lc);
                }
            }
        }
        int length=(lr-fr+1);
        int width=(lc-fc+1);
        int area=length*width;
        return area;
       
        
    }
}