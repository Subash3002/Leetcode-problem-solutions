class Solution {
    boolean find(int mid,int[] nums,int k){
        int subarrays=0;
        int sum=0;
        for(int i:nums){
            sum+=i;
            if(sum>mid){
                sum=i;
                subarrays++;
            }
        }
        return subarrays+1<=k;
    }
    public int splitArray(int[] nums, int k) {
        int ans=0;
        int maxx=Integer.MIN_VALUE;
        int sum=0;

        for(int i:nums){
            maxx=Math.max(maxx,i);
            sum+=i;
        }

        int l=maxx;
        int h=sum;

        while(l<=h){
            int mid=l+(h-l)/2;
            if(find(mid,nums,k)){
                ans=mid;
                h=mid-1;
            }else{
                l=mid+1;
            }
        }

        return ans;
    }
}