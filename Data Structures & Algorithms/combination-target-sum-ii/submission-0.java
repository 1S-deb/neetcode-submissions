class Solution {
    
    public void fun(int[] nums, int ind, int target,
                    List<List<Integer>> ans,
                    List<Integer> list) {
        
        if (target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for (int i = ind; i < nums.length; i++) {
            
            // Skip duplicates
            if (i > ind && nums[i] == nums[i - 1])
                continue;
            
            // Stop if number exceeds target
            if (nums[i] > target)
                break;
            
            list.add(nums[i]);
            fun(nums, i + 1, target - nums[i], ans, list);
            list.remove(list.size() - 1);
        }
    }
    
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(candidates);
        fun(candidates, 0, target, ans, new ArrayList<>());
        return ans;
    }
}
