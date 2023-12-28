class Solution {
    public int reversePairs(int[] nums) {
        int low=0;
        int high=nums.length-1;
        return mergeSort(nums,low,high);
    }

    int mergeSort(int[] arr,int low,int high){
        int cnt=0;
        if(low>=high) return cnt;
        int mid=(low+high)/2;
        cnt+=mergeSort(arr,low,mid);
        cnt+=mergeSort(arr,mid+1,high);
        cnt+=findPairs(arr,low,high,mid);
        merge(arr,low,high,mid);
        return cnt;
    }

    int findPairs(int[] arr,int low,int high,int mid){
        
        int right=mid+1;
        int cnt=0;

        for(int left=low;left<=mid;left++){
            while(right<=high && arr[left]>2l*arr[right]){
                right++;
            }
            cnt+=(right-mid-1);
        }
        return cnt;
        
    }

    void merge(int[] arr,int low,int high,int mid){
        ArrayList<Integer> li=new ArrayList<>();
        int left=low;
        int right=mid+1;

        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                li.add(arr[left]);
                left++;
            }else{
                li.add(arr[right]);
                right++;
            }
        }

        for(;left<=mid;left++){
            li.add(arr[left]);
        }

        for(;right<=high;right++){
            li.add(arr[right]);
        }

        for(int i=low;i<=high;i++){
            arr[i]=li.get(i-low);
        }

    }


}