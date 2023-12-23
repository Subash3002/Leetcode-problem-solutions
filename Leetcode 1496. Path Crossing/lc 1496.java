class Solution {
    public boolean isPathCrossing(String path) {
        HashSet<String> s=new HashSet<>();
        s.add("0,0");
        int x=0;
        int y=0;
        for(char c:path.toCharArray()){
            if(c=='N')y++;
            else if(c=='S')y--;
            else if(c=='E')x++;
            else x--;

            String cord=x+","+y;
            if(s.contains(cord))return true;
            s.add(cord);
        }
        return false;
    }
}