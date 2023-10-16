class Solution {
public:
    vector<int> getRow(int rowIndex) {
        vector<int> res;
        long long ans=1;
        res.emplace_back(1);
        rowIndex++;
        for(int col=1;col<rowIndex;col++){
            ans*=rowIndex-col;
            ans/=col;
            res.emplace_back(ans);
        }
        return res;
    }
};
