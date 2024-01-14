class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] arr=new int[26];
        for(int i=0;i<word1.length();i++){
            char c=word1.charAt(i);
            arr[c-'a']++;
        }
        int[] arr2=new int[26];
        for(int i=0;i<word2.length();i++){
            char c=word2.charAt(i);
            arr2[c-'a']++;
        }
        for(int i=0;i<26;i++){
            if(arr[i]!=arr2[i] && (arr[i]<=0 || arr2[i]<=0))return false;
        }
        Arrays.sort(arr);
        Arrays.sort(arr2);
        for(int i=0;i<26;i++){
            if(arr[i]!=arr2[i])return false;
        }
        return true;
    }
}