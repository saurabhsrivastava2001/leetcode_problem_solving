class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        s=''
        y=''
        for i in word1:
            s=s+i
        for j in word2:
            y=y+j
        if (s==y):
            return True
        else :
            return False        
