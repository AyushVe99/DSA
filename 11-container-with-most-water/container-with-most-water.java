class Solution {
    public int maxArea(int[] height) {
        int mostWater = 0;

        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int width = right - left;
            int h = Math.min(height[left], height[right]);
            int area = h * width;
            mostWater = Math.max(mostWater, area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return mostWater;

    }
}