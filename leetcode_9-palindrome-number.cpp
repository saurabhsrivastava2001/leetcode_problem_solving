//leetcode-9-palindrome_number
class Solution {
public:
    bool isPalindrome(int x) {
        if (x<0 || x>2147483647)
        {
            return false;
        }
        int y=x;
        long int rev =0;
        while (x>0){
            rev=rev*10;
            rev= rev +(x%10);
            x=x/10;
        }
        if (rev==y){
            return true;}
        else
         return false;
        }
};
