class RandomizedSet {
    ArrayList<Integer> arr;
    HashMap<Integer,Integer> hm;
    public RandomizedSet() {
        arr=new ArrayList<>();
        hm=new HashMap<>();
    }
    
    public boolean insert(int val) {
        if(hm.containsKey(val))return false;
        hm.put(val,arr.size());
        arr.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!hm.containsKey(val)) return false;
        int ind=hm.get(val);
        int lastEle=arr.get(arr.size()-1);
        arr.set(ind,lastEle);
        hm.put(lastEle,ind);
        arr.remove(arr.size()-1);
        hm.remove(val);
        return true;

    }
    
    public int getRandom() {
        Random r=new Random();
        int ind=r.nextInt(arr.size());
        return arr.get(ind);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */