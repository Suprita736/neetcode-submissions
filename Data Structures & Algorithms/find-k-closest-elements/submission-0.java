class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        ArrayList<Integer> l = new ArrayList<>();
        int i = 0,j = k;
        while(i < j && j < nums.length){
            if((Math.abs(nums[i] - x) < Math.abs(nums[j] - x)) || (Math.abs(nums[i] - x) == Math.abs(nums[j] - x) && nums[i] < nums[j])){
            for(int y = i;y < j;y++){
                l.add(nums[y]);
              }
              return l;
            }
            else{
                i++;
                j++;
            }
        }
        if(l.size() == 0) {
            for(int y = i;y < j;y++){
                l.add(nums[y]);
            }
        }
        return l;
    }
}