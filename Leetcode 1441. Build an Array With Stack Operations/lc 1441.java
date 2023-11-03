class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new ArrayList<>();
        int ind=0;
        for(int i=1;i<=n && ind<target.length;i++){
            int val=target[ind];
            if(i<val){
                ans.add("Push");
                ans.add("Pop");
            }else if(i==val){
                ans.add("Push");
                ind++;
            }
            
        }
        return ans;
    }
}