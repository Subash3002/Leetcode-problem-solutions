class Solution {
public:
    int numFactoredBinaryTrees(vector<int>& arr) {
        int mod=1000000007;
        sort(arr.begin(),arr.end());
        unordered_map<int,int> mp;
        mp[arr[0]]++;
        for(int i=1;i<arr.size();i++){
            mp[arr[i]]=1;
            for(int j=2;j*j<=arr[i];j++){
                if(arr[i]%j==0 && mp.find(j)!=mp.end() && mp.find(arr[i]/j)!=mp.end()){
                    int poss=((long)mp[j]%mod*(long)mp[arr[i]/j]%mod)%mod;
                    if(j!=arr[i]/j){
                        poss=(poss%mod *2)%mod;
                    }
                    mp[arr[i]]=(mp[arr[i]]%mod + poss%mod)%mod;
                    cout<<arr[i]<<" "<<mp[arr[i]]<<endl;
                    
                }
                
            }
            
        }

        int ans=0;

        for(auto [k,v]:mp){
           // cout<<ans<<endl;
            ans=(ans%mod + v%mod)%mod;
        }
        return ans;
    }
};