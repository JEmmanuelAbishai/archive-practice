class NumArray {
    private int[] prefsum;

    public NumArray(int[] nums) {
        prefsum = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            prefsum[i + 1] = prefsum[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        return prefsum[right + 1] - prefsum[left];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */