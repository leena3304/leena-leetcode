class neighborSum {
int n=0;
    int grid1[][];
    public neighborSum(int[][] grid) {
       n=grid[0].length;
        grid1=grid;
    }
    
    public int adjacentSum(int value) {
        int asum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid1[i][j]==value){
                    asum+=(i>0)?grid1[i-1][j]:0;
                    asum+=(i<n-1)?grid1[i+1][j]:0;
                    asum+=(j>0)?grid1[i][j-1]:0;
                    asum+=(j<n-1)?grid1[i][j+1]:0;
                    break;
                }
            }
        } 
        return asum;
       
    }
    
    public int diagonalSum(int value) {
        int dsum=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(grid1[i][j]==value){
                     dsum+=(i>0 &&j>0)?grid1[i-1][j-1]:0;
                     dsum+=(i>0 && j<n-1)?grid1[i-1][j+1]:0;
                    dsum+=(i<n-1 && j>0)?grid1[i+1][j-1]:0;
                    dsum+=(i<n-1 && j<n-1)?grid1[i+1][j+1]:0;
                    break;
                }
            }
        }
       
        return dsum;
        
    }
}

/**
 * Your neighborSum object will be instantiated and called as such:
 * neighborSum obj = new neighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */