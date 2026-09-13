class Solution {
    public int lastStoneWeight(int[] s) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0;i < s.length;i++){
            pq.add(s[i]);
        }
        while(pq.size() > 1){
            int a = pq.poll();
            int b = pq.poll();
            if(a != b) {
                pq.add(Math.abs(a-b));
            }
        }
        if(pq.isEmpty()) return 0;
        return pq.poll();
    }
}
