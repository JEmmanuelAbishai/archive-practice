class Solution {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();



    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        btk(0, candidates, target);
        return res;
    }

    public void btk(int idx, int[] candidates, int target){
        if(target == 0){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = idx; i < candidates.length; i++){
            if(candidates[i] > target) continue;
            temp.add(candidates[i]);
            btk(i, candidates, target - candidates[i]);
            temp.remove(temp.size()-1);
        }


    }
}