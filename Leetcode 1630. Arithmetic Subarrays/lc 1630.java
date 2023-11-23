class Solution {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans=new ArrayList<>();

        for(int i=0;i<l.length;i++){
            int s=l[i];
            int e=r[i];
            List<Integer> arr=new ArrayList<>();
            for(int j=s;j<=e;j++){
                arr.add(nums[j]); 
            }
            Collections.sort(arr);
            int f=1;
            for(int j=1;j<arr.size()-1;j++){
                if(Math.abs(arr.get(j-1)-arr.get(j))!=Math.abs(arr.get(j)-arr.get(j+1))){
                    f=0;
                    break;
                }
            }
            if(f==1) ans.add(true);
            else ans.add(false);
            arr.clear();
        }
        return ans;
    }
}