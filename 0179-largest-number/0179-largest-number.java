class Solution {
    public String largestNumber(int[] nums) {
         int n=nums.length;
       StringBuilder sb=new StringBuilder();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=String.valueOf(nums[i]);  
        
        }
         Arrays.sort(arr,(a,b) ->(b+a).compareTo(a+b));
                 

         
        for(String s:arr){
            sb.append(s);
        }
       
        String res= sb.toString();
        return res.startsWith("0")?"0":res;
        
    }
}