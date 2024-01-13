class Solution {
    public int minSteps(String s, String t) {
        int[] arr=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            arr[c-'a']++;
        }
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(arr[c-'a']>0){
                arr[c-'a']--;
            }
        }
        int cnt=0;
        for(int i:arr){
            cnt+=i;
        }

        return cnt;

    }
}