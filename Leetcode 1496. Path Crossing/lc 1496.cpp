class Solution {
public:
    bool isPathCrossing(string path) {
        unordered_set<string> s;
        s.insert({"0,0"});
        int x=0;
        int y=0;
        for(char c:path){
            if(c=='N')y++;
            else if(c=='S')y--;
            else if(c=='E')x++;
            else x--;

            string cord=to_string(x)+","+to_string(y);
            if(s.find(cord)!=s.end())return true;
            s.insert(cord);
        }
        return false;
    }
};