class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer>rows=new HashSet<Integer>();
        Set<Integer>cols=new HashSet<Integer>();
        int m=matrix.length;
        int n=matrix[0].length;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        for(int k=0;k<m;k++){
            for(int l=0;l<n;l++){
                if(rows.contains(k)||cols.contains(l)){
                    matrix[k][l]=0;
                }
            }
        }
       
    }
};