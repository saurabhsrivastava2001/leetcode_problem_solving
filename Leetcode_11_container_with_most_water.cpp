//this is the main solution function required , problem-11 (container with most water)
class Solution {
public:
    int maxArea(vector<int>& height) {
       int l=0; 
       int r= ((height.size())-1);
       int maxx=0;
       while (l<r){
           int lh=height[l];
           int rh=height[r];
           int min_h= min(rh,lh);
           int len=r-l;
           int curr_area=len*min_h;
           maxx= max(maxx,curr_area); 
           if(lh<rh)l++;
           else r--; 
       } 
       return maxx;
    }
};
