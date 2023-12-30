class Solution {
public:
    bool isPalin(string s,int low,int hig){
        int l=low;
        int h=hig;
        if(l<0 || h>=s.length())return false;
        
        while(l<=h){
            if(s[l]!=s[h]){
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
    bool validPalindrome(string s) {
        int l=0;
        int h=n;
        while(l<=h){
            if(s[l]!=s[h]){
                return (isPalin(s,l+1,h) || isPalin(s,l,h-1));
            }
            l++;
            h--;
        }
        return true;
    }
};