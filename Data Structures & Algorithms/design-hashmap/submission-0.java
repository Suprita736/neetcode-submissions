class MyHashMap {
    boolean[] check = new boolean[1000001];
    int[] hashMap = new int[1000001];
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        check[key] = true;
        hashMap[key] = value;
    }
    
    public int get(int key) {
        if(check[key] != true) return -1;
        return hashMap[key];
    }
    
    public void remove(int key) {
        check[key] = false;
        hashMap[key] = 0;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */