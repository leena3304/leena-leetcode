class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>>res=new ArrayList<>();
        HashMap<String, List<String>>hm=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String key1=generateKey(strs[i]);
            if(hm.containsKey(key1)){
                hm.get(key1).add(strs[i]);
            }
            else{
               List<String> newList = new ArrayList<>();
               newList.add(strs[i]);  // Add the string to the list
               hm.put(key1, newList);
             }
        }
        for(Map.Entry<String,List<String>>e:hm.entrySet()){
            res.add(e.getValue());
        }
        return res;
        
    }
    public static String generateKey(String s){
        HashMap<Character,Integer>hm=new HashMap<>();
        for(char ch='a';ch<='z';ch++){
            hm.put(ch,0);
        }
        
        for(int i=0;i<s.length();i++){
          hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
        }
        String key="#";
        for(char ch='a';ch<='z';ch++){
            key+=hm.get(ch)+"#";
        }
        return key;
    }
}