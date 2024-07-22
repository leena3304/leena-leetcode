class Solution {
    public boolean isPerfectSquare(int num) {
        long l=1;
        long h=num;
        long mid;
        while(l<=h){
            mid=(l+h)/2;
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid<num){
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return false;
    }
}