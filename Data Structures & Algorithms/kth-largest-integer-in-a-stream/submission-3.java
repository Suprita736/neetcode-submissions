class KthLargest {
    int k;
    int[] nums;
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        for(int i = 0;i < nums.length;i++){
            pq.add(nums[i]);
        }
        for(int j = 0;j < nums.length - k;j++){
            pq.poll();
        }
    }

    public int add(int val) {
        if(pq.isEmpty() || k > pq.size()){
            pq.add(val);
            return pq.peek();
        }
        if(val < pq.peek()) return pq.peek();
        else {
            pq.poll();
            pq.add(val);
        }
        return pq.peek();
    }
}
