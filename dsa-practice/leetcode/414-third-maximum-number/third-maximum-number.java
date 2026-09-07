class Solution {
    public int thirdMax(int[] nums) {
        Long max1 = null;
        Long max2 = null;
        Long max3 = null;

        for (int num : nums) {
            long current = num;

            if ((max1 != null && current == max1) || 
                (max2 != null && current == max2) || 
                (max3 != null && current == max3)) {
                continue;
            }

            if (max1 == null || current > max1) {
                max3 = max2;
                max2 = max1;
                max1 = current;
            } else if (max2 == null || current > max2) {
                max3 = max2;
                max2 = current;
            } else if (max3 == null || current > max3) {
                max3 = current;
            }
        }

        return max3 == null ? max1.intValue() : max3.intValue();
    }
}
