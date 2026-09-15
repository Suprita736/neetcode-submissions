class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int count = 0,j = 0;
        mp.put(nums[j], 1);
        if(nums[j] == k) count++;
        for(j = 1;j < nums.length;j++){
            nums[j] += nums[j-1];
            if(nums[j] == k) count++;
            if(mp.containsKey(nums[j] - k)) count += mp.get(nums[j] - k);
            mp.put(nums[j], mp.getOrDefault(nums[j], 0) + 1);
        }
        return count;
    }
}