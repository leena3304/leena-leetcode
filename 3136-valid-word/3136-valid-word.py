class Solution:
    def isValid(self, word: str) -> bool:
       # n=len(str)
        d=0
        v=0
        c=0
        spe='!@#$%^&*()-+'
        vowels=set('aeiouAEIOU')
        consonants=set('bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ')
        
        for ch in word:
            if ch in spe:
                return False
                break
            if ch.isdigit():
                d+=1
            elif ch in vowels:
                v+=1
            elif ch in consonants:
                c+=1
                
            
                
                    
                
        if len(word)>=3:
            if(v>=1 and c>=1):
                return True
        else:
            return False
        
                
                
        