class Solution {
    public String destCity(List<List<String>> paths) {
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<paths.size();i++){
            hs.add(paths.get(i).get(0));
        }

        for(List<String> path:paths){
            if(!hs.contains(path.get(1))){
                return path.get(1);
            }
        }

        return "";
    }
}