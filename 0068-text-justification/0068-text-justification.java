import java.util.*;
class Solution {
    public List<String> fullJustify(String[] words, int maxWidth){
        List<String>currLine=new ArrayList<>();
        List<String>res=new ArrayList<>();
        int currWidth=0;
        for(int i=0;i<words.length;i++){
          int val=currLine.size()==0? words[i].length():(currWidth + words[i].length()+1);
          if(val<=maxWidth){
           currLine.add(words[i]);
           currWidth=val;
          }
          else{
             if(currLine.size()>1){
                  withkwords(currLine,currWidth,maxWidth,res);
             } 
              else{
                  withoneword(currLine,currWidth,maxWidth,res);
              }
              currLine=new ArrayList<>();
              currLine.add(words[i]);
              currWidth=words[i].length();     
          }     
        }
        processLastLine(currLine,currWidth,maxWidth,res);
        return res;
    }
    public static void processLastLine(List<String>currLine,int currWidth,int                    maxWidth,List<String>res){
       
        int whitespaces=maxWidth-currWidth;
        String tempres=currLine.get(0);
        if(currLine.size()>1){
          for(int i=1;i<currLine.size();i++){
              tempres+=" "+currLine.get(i);
           }
        }
        while(whitespaces>0){
            tempres+=" ";
            whitespaces--;
        }
        res.add(tempres);
    }
    public static void withkwords(List<String>currLine,int currWidth,int                        maxWidth,List<String>res){
        int whitespaces=maxWidth-currWidth;
        int evenspaces=whitespaces/(currLine.size()-1);
        int unevenspaces=whitespaces%(currLine.size()-1);
        int word=0;//index
        while(word < currLine.size()-1){
            int spaces=0;
            while(spaces<evenspaces){
                currLine.set(word,currLine.get(word)+" ");
                spaces++;
            }
            word++;
        }
        word=0;
        while(unevenspaces > 0){ //after distributing spaces evenly if there are still                  
                currLine.set(word,currLine.get(word)+" ");
                word++;
                unevenspaces--;
            
        }
        String tempres="";
        for(int k=0;k<currLine.size();k++){
            if(k==0){
                tempres+=currLine.get(k);
            }
            else{
                tempres=tempres+" "+currLine.get(k);
            }
        }
        res.add(tempres);        
    }
    public static void withoneword(List<String>currLine,int currWidth,int                           maxWidth,List<String>res){
        int whitespaces=maxWidth-currWidth;
       String tempres=currLine.get(0);
        while(whitespaces>0){
            tempres+=" ";
            whitespaces--;
        }
        res.add(tempres);
    }
    
    
    
}