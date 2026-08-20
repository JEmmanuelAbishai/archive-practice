class Solution {
    List<Integer> temp = new ArrayList<>();
    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        btk(0, nums);
        return res;
    }

    private void btk(int idx, int[] nums){
        res.add(new ArrayList<>(temp));
        for(int i = idx; i < nums.length; i++){
            if(i > idx && nums[i] == nums[i-1]) continue;
            temp.add(nums[i]);
            btk(i+1, nums);
            temp.remove(temp.size() - 1);
        }
    }
}