class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            ans.add(eachRow(i));
        }
        return ans;
    }

    List<Integer> eachRow(int row){
        List<Integer> arr=new ArrayList<>();
        long ans=1;
        arr.add(1);
        for(int col=1;col<row;col++){
            ans*=row-col;
            ans/=col;
            arr.add((int)ans);
        }
        return arr;
    }

}