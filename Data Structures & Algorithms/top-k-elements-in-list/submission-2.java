class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : mp.entrySet()){
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }
        arr.sort((a, b) -> b[0] - a[0]);
        int[] r = new int[k];
        for(int i=0;i<k;i++){
            r[i] = arr.get(i)[1];
        }
        return r;
    }
}
