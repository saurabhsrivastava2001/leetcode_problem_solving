class Solution {
    public boolean isPerfectSquare(int num) {
        long s = 1;
        long e= num;
        while(s<=e)
        {
            long mid= s+(e-s)/2;
            if  (mid*mid>num){
                e= mid-1;
            }
            else if (mid*mid<num){
                s=mid+1;
            }else return true;
        }
    return false;
 }
}
