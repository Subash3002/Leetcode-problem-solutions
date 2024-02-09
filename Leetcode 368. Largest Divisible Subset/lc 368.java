class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n=nums.length;
        int[] Previndex=new int[n];
        int[] lis=new int[n];
        int index=-1,maxlen=0;
        Arrays.fill(Previndex,-1);
        Arrays.fill(lis,1);

        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[i]%nums[j]==0 && 1+lis[j]>lis[i]){
                    lis[i]=1+lis[j];
                    Previndex[i]=j;
                }
            }

            if(maxlen<lis[i]){
                maxlen=lis[i];
                index=i;
            }
        }

        List<Integer> ans=new ArrayList<>();
        while(index!=-1){
            ans.add(nums[index]);
            index=Previndex[index];
        }

        return ans;



    }
}