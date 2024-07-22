class Solution {
    public int minChanges(int n, int k) {
        int c=0;
        if(n==k){
            return 0;
        }
  
        for(int i=0;i<30;i++){
            if(checkbit(n,i)==true && checkbit(k,i)==false){
                c++;
            }
            else if(checkbit(n,i)==false && checkbit(k,i)==true){
                return -1;
            }
        }
        return c;
    }
    public static boolean checkbit(int num,int pos){
        if(((num>>pos) &1)==1){
            return true;
        }
        return false;
    }
    
}