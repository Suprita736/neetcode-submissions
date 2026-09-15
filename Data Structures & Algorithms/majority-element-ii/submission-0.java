class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        ArrayList<Integer> l = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
            if(mp.get(nums[i]) > (nums.length/3)){
                if(!l.contains(nums[i])) l.add(nums[i]);
            }
        }
        return l;
    }
}