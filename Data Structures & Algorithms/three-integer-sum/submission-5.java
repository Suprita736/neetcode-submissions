class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<>();
        int j,k,curr=0,count = 0;
        for(int i = 0;i<nums.length-2;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            curr = -(nums[i]);
            j = i+1;
            k=nums.length-1;
            while(j<k){
                if(nums[j] + nums[k] == curr){
                    l.add(new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k])));
                    j++;
                    k--;
                    while(j < k && nums[j-1] == nums[j] && nums[k] == nums[k+1]){
                        j++;
                        k--;
                    }
                }
                else if(nums[j] + nums[k] < curr) j++;
                else if(nums[j] + nums[k] > curr) k--;
            }
        }
        return l;
    }
}
