class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1=nums1.length;
        int len2=nums2.length;
        int[] mergedArr=new int[len1+len2];
        int mergeLen=mergedArr.length;
        int nums1key=0;
        int nums2key=0;
        boolean flag1=true;
        boolean flag2=true;
        int i=0;
        int minlen=0;
        if(len1<=len2 ){
            minlen=len1;
            while(nums1key<minlen && nums2key<len2){
                if(nums1[nums1key]<=nums2[nums2key]){
                    mergedArr[i]=nums1[nums1key];
                    nums1key++;
                }else{
                    mergedArr[i]=nums2[nums2key];
                    nums2key++;
                }
                i++;  
            }
        }else{
            minlen=len2;
            while(nums2key<minlen && nums1key<len1){
                if(nums1[nums1key]<=nums2[nums2key]){
                    mergedArr[i]=nums1[nums1key];
                    nums1key++;
                }else{
                    mergedArr[i]=nums2[nums2key];
                    nums2key++;
                }
                i++;  
            }
        }
        
        if(minlen==len1 && nums2key<len2){
            while(nums2key<len2 && i<mergeLen){
                mergedArr[i]=nums2[nums2key];
                nums2key++;
                i++;
            }
            
        }
        if(minlen==len2 && nums1key<len1){
            while(nums1key<len1 && i<mergeLen){
                mergedArr[i]=nums1[nums1key];
                nums1key++;
                i++;
            }
        }
        
        if(mergeLen%2==0){
            double ans=mergedArr[(mergeLen/2)-1]+mergedArr[mergeLen/2];
            return ans/2;
        }
        return mergedArr[mergeLen/2];
    }
}