class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans=new ArrayList<>();
        ans.add(1);
        long a=1;

        for(int col=1;col<rowIndex+1;col++){
            a*=rowIndex+1-col;
            a/=col;
            ans.add((int)a);
        }
        return ans;
    }
}