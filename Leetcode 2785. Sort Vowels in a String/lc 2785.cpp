class Solution {
public:
    char vowels[5]={'a','e','i','o','u'};
    int find(char c){
        for(int i=0;i<5;i++){
            if(c==vowels[i]){
                return 1;
            }
        }
        return 0;
    }
    string sortVowels(string s) {
        vector<char> vowels_found;
        
        for(int i=0;i<s.length();i++){
            char c=tolower(s[i]);
            if(find(c)) vowels_found.emplace_back(s[i]);      
        }

        sort(vowels_found.begin(),vowels_found.end());
        int ind=0;
        for(int i=0;i<s.length();i++){
            if(find(tolower(s[i]))){
                s[i]=vowels_found[ind++];
            }
        }
        return s;
        
    }
};