class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int wsum = 0;
        for(int i = 0; i < k; i++){
            wsum += nums[i];
        }

        int max = wsum;
        for(int i = k; i < nums.length; i ++){
            wsum += nums[i];
            wsum -= nums[i-k];
            max = Math.max(max,wsum);

        }

        return (double) max/k;
    }
}