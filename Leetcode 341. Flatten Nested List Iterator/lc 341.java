/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    static List<Integer> arr;
    static int index;
    public NestedIterator(List<NestedInteger> nestedList) {
        arr=new ArrayList<>();
        index=0;
        flattenList(nestedList);
    }

    @Override
    public Integer next() {
        return arr.get(index++);
    }

    @Override
    public boolean hasNext() {
        return index<arr.size();
    }

    void flattenList(List<NestedInteger> nestedList){
        for(NestedInteger l:nestedList){
            if(l.isInteger()){
                arr.add(l.getInteger());
            }else{
                flattenList(l.getList());
            }
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */