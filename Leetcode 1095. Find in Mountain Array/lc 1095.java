/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int len=mountainArr.length();
        int l=1;
        int r=len-1;
        int peak=0;
        //Finding peak;
        while(l<=r){
            int m=l+(r-l)/2;
            int mid=mountainArr.get(m);
            int midPrev=mountainArr.get(m-1);
            int midNext=mountainArr.get(m+1);

            if(midPrev<mid && mid<midNext){
                l=m+1;
            }else if(midPrev>mid && mid>midNext){
                r=m-1;
            }else{
                peak=m;
                break;
            }
        }
       

        //searching in left side of peak
        l=0;
        r=peak;
        while(l<=r){
            int m=l+(r-l)/2;
            if(mountainArr.get(m)<target){
                l=m+1;
            }else if(mountainArr.get(m)>target){
                r=m-1;
            }else{
                return m;
            }
        }

        //searching in right side of peak
        l=peak+1;
        r=len-1;
        while(l<=r){
            int m=l+(r-l)/2;
            if(mountainArr.get(m)>target){
                l=m+1;
            }else if(mountainArr.get(m)<target){
                r=m-1;
            }else{
                return m;
            }
        }
        return -1;

    }
}