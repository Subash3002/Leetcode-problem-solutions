class Solution {
public:
    static bool cmp(int x,int y){
        int t1=x,t2=y,c1=0,c2=0;
        while(t1){
            c1++;
            t1=(t1&(t1-1));
        }
        while(t2){
            c2++;
            t2=(t2&(t2-1));
        }
        if(c1!=c2){
            return c1<c2;
        }
        return x<y;
    }
    vector<int> sortByBits(vector<int>& arr) {
        sort(arr.begin(),arr.end(),cmp);
        return arr;
    }
};