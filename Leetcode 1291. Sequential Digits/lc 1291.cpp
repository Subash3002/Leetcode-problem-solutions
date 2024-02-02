class Solution {
public:
    vector<int> sequentialDigits(int low, int high) {
        string c="123456789";
        vector<int> ans;

        for(int i=0;i<9;i++){
            for(int j=i+1;j<9;j++){
                int n=stoi(c.substr(i,j-i+1));
                if(n>=low && n<=high){
                    ans.push_back(n);
                }
            }
        }
        sort(ans.begin(),ans.end());
        return ans;
    }
};