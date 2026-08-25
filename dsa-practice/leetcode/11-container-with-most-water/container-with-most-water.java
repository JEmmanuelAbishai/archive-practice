class Solution {
    public int maxArea(int[] height) {
        int maxw = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            int width = right - left;
            int cheight = Math.min(height[left], height[right]);
            int cwater = width * cheight;
            maxw = Math.max(maxw, cwater);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxw;
    }
}
