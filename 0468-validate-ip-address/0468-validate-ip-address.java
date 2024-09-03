class Solution {
    public String validIPAddress(String queryIP) {
       int dot=0;
        int colon=0;
        char ch[]=queryIP.toCharArray();
        for(char i=0;i<ch.length;i++){
            if(ch[i]=='.'){
                dot++;
            }
            else if(ch[i]==':'){
                colon++;
            }
        }
        if(dot!=3  && colon!=7){
            return "Neither";
        }
        if(dot>0){ //it means it can be ipv4 because ipv6 dont contain dots
            String values[]=queryIP.split("\\.");
            if(values.length!=4){
                return "Neither";
            }
            for(int i=0;i<values.length;i++){
              
                
               
                  if(values[i].length()>1 && values[i].charAt(0)=='0'){
                        return "Neither";
                    }
                   
                
                for( char c:values[i].toCharArray()){
                    if(!Character.isDigit(c)){
                        return "Neither";
                    }
                }
                 if(values[i].length() == 0 || values[i].length() > 3 || Integer.parseInt(values[i]) < 0 || Integer.parseInt(values[i]) > 255) {
                    return "Neither";
                }
            }
            return "IPv4";
        }
        else{
            String values[]=queryIP.split("\\:");
            if(values.length!=8){
                return "Neither";
            }
            for(int i=0;i<values.length;i++){
                if(values[i].length() == 0 || values[i].length()>4){
                return "Neither";
            }
                for(char ch1:values[i].toCharArray()){
                    if(!Character.isDigit(ch1) && (ch1<'a'||ch1>'f') && (ch1<'A' || ch1>'F')){
                        return "Neither";
                    }
                }
            }
            return "IPv6";
            
        }
    }
}