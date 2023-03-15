//leetcode-53-maximum subarray also known as Kadane's algorithm
class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int lmax=nums[0];
        int gmax =nums[0];
        int s=nums.size();
        if (s==0){
            return 0;
        }
        for (int i=1;i<s;i++){
            if (nums[i]>(nums[i]+lmax)){
                lmax=nums[i];
            }
            else lmax=lmax+nums[i];
            gmax=max(gmax,lmax);
        }
        return gmax;
    }
};