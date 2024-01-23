class Solution {
    int subseq(int ind,List<String> arr,String s,List<String> sq){
        if(!check(s)){
            return 0;
        }
        if(ind==arr.size()){
            return s.length();
        }
        return Math.max(subseq(ind+1,arr,s+arr.get(ind),sq),subseq(ind+1,arr,s,sq));
    }

    boolean check(String a){
        int[] freq=new int[26];
        for(int i=0;i<a.length();i++){
            char c=a.charAt(i);
            freq[c-'a']++;
            if(freq[c-'a']>1)return false;
        }
        return true;
    }
    public int maxLength(List<String> arr) {
        
        List<String> sq=new ArrayList<>();
        return subseq(0,arr,"",sq);
    }
}