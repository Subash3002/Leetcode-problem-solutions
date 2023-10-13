/**
 * // This is the MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * class MountainArray {
 *   public:
 *     int get(int index);
 *     int length();
 * };
 */

class Solution {
public:
    int findInMountainArray(int target, MountainArray &mountainArr) {
        
        int s=1;
        int e=mountainArr.length()-2;
        int peak=0;
        int m=0;
        while(s<=e){
            m=s+(e-s)/2;

            int mid=mountainArr.get(m);
            int midprev=mountainArr.get(m-1);
            int midnext=mountainArr.get(m+1);

            if(midprev<mid && mid<midnext){
                s=m+1;
            }else if(midprev>mid && mid>midnext){
                e=m-1;
            }else{
                peak=m;
                break;
            }
        }
        cout<<peak;
        s=0;
        e=peak;
        while(s<=e){
            m=s+(e-s)/2;
            if(mountainArr.get(m)<target){
                s=m+1;
            }else if(mountainArr.get(m)>target){
                e=m-1;
            }else{
                return m;
            }
        }

        s=peak+1;
        e=mountainArr.length()-1;

        while(s<=e){
            m=s+(e-s)/2;

            if(mountainArr.get(m)<target){
                e=m-1;
            }else if(mountainArr.get(m)>target){
                s=m+1;
            }else{
                return m;
            }
        }
        return -1;
    }
};