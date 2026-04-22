class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(nums[0],0);
        for(int i=1;i<nums.length;i++){
            if(mp.containsKey(target-nums[i])){
                arr[0] = mp.get(target-nums[i]);
                arr[1] = i;
                return arr;
            }
            else{
                mp.put(nums[i], i);
            }
        }
        return arr;
    }
}
