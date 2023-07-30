class Solution {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans=new ArrayList<Boolean>();
        
        for(String s:queries){
            int i=0;
            boolean notupper=true;
            for(int j=0;j<s.length();j++){
                if(i<pattern.length()){
                    if(Character.isUpperCase(s.charAt(j))){
                        if(s.charAt(j)!=pattern.charAt(i)){
                            notupper=false;
                            break;
                        }
                    }
                    if(s.charAt(j)==pattern.charAt(i)){
                    i++;
                    }
                }else{
                    if(Character.isUpperCase(s.charAt(j))){
                        notupper=false;
                        break;
                    }
                }
                
            }
            if(i==pattern.length() && notupper){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }

        return ans;
    }
}