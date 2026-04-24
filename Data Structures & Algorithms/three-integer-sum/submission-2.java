class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Map<List<Integer>, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<>();
        int j,k,curr=0,count = 0;
        for(int i = 0;i<nums.length-2;i++){
            curr = -(nums[i]);
            j = i+1;
            k=nums.length-1;
            while(j<k){
                if(nums[j] + nums[k] == curr){
                    List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
                    if(!map.containsKey(list)){
                        l.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                        map.put(l.get(count), 1);
                        count++;
                    }
                    j++;
                    k--;
                }
                else if(nums[j] + nums[k] < curr) j++;
                else if(nums[j] + nums[k] > curr) k--;
            }
        }
        return l;
    }
}
