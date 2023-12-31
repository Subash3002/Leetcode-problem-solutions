class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
        List<String> ds=new ArrayList<>();
        func(0,s,ds,ans);
        return ans;
    }

    boolean func(int ind,String s,List<String> ds,List<List<String>> ans){
        if(ind==s.length()){
            ans.add(new ArrayList<>(ds));
            return true;
        }

        for(int i=ind;i<s.length();i++){
            String str=s.substring(ind,i+1);
            if(isPalindrome(str)){
                ds.add(str);
                func(i+1,s,ds,ans);
                ds.remove(ds.size()-1);
            }
        }
        return false;
    }

    boolean isPalindrome(String s){
        int start=0;
        int end=s.length()-1;

        while(start<=end){
            if(s.charAt(start++)!=s.charAt(end--)){
                return false;
            }
        }
        return true;
    }
}