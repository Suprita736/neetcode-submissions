class MyHashSet {
    LinkedList<Integer> l = new LinkedList<>();
    public MyHashSet() {
        
    }
    
    public void add(int key) {
        if(l.contains(key)) return;
        else l.add(key);
    }
    
    public void remove(int key) {
        l.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) {
        if(l.contains(key)) return true;
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */