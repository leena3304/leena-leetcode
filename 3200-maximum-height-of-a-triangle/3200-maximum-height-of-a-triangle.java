class Solution {
    public int helper(int first, int second) {
        int sum=1,h=0;
        while(true){
        if(sum%2==1){
            if(sum<=first){
                first-=sum;
            }
            else{
                break;
            }
        }
        else{
            if(second>=sum){
            second-=sum;
            }
            else{
                break;
            }
        }
            h++;
            sum++;
        }
        
       return h; 
       
    }
    public int maxHeightOfTriangle(int red,int blue){
    
    
       int h1=helper(red,blue);
       int h2=helper(blue,red);
       return Math.max(h1,h2);
    }
    
}