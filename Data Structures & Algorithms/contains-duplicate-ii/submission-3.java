class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        if(nums.length == 1 || k == 0) return false;
        for(int i=0;i<nums.length;i++) {
            if(mp.containsKey(nums[i])) {
                mp.put(nums[i], Math.abs(mp.get(nums[i]) - i));
                if(mp.get(nums[i]) <= k) return true;
                else mp.put(nums[i],i);
            }
            else{
                mp.put(nums[i],i);
            }
        }
        return false;
    }
}