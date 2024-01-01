class Solution {
public:
    int findContentChildren(vector<int>& g, vector<int>& s) {
        int m=g.size();
        int n=s.size();
        sort(g.begin(),g.end());
        sort(s.begin(),s.end());

        int i1=0;
        int i2=0;

        while(i1<m && i2<n){
            while(i1<m && i2<n && g[i1]<=s[i2]){
                i1++;
                i2++;
            }
            i2++;
        }
        
        return i1;
    }
};