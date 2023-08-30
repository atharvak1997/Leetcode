class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int maxS = 0;
        
        while(l < r) {
            maxS = Math.max(maxS, (Math.min(height[l], height[r])) * (r - l));
            if(height[l] < height[r]) {
                l++;
            }
            else {
                r--;
            }
        }
        
        return maxS;
    }
}