class Solution {
    public int search(int[] nums, int target) {
        int s = 0; //initially
        int e= nums.length -1;//initially
        while(s<=e){
            int mid= s + (e-s)/2;// mid item
            if  ( nums[mid]>target){
                e= mid-1;//target must lie in the left side
            }
            else if (nums[mid]<target){
                s=mid+1;// target must lie in the right side
            }else return mid;// else mid ==target thus return
        };
        return -1; 
    }
}
