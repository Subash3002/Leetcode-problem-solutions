class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> ans=new ArrayList<>();
        for(String s:words){
            int ind=0;
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==separator){
                    String a=s.substring(ind,i);
                    if(a!=""){
                        ans.add(a);
                    }
                    ind=i+1;
                }
            }
            if(ind<=s.length()){
                String b=s.substring(ind,s.length());
                if(b!=""){
                    ans.add(b);
                }
                
            }
            
        }
        return ans;
    }
}