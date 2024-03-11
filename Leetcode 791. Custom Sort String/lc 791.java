class Solution {
    public String customSortString(String order, String s) {
        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
        }
        StringBuilder ans=new StringBuilder();

        for(int i=0;i<order.length();i++){
            char c=order.charAt(i);
            int f=freq[c-'a'];
            for(int j=0;j<f;j++){
                ans.append(c);
            }
            freq[c-'a']=0;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                for(int j=0;j<freq[i];j++){
                    ans.append((char)('a'+i));
                }
            }
        }
        return ans.toString();
    }
}