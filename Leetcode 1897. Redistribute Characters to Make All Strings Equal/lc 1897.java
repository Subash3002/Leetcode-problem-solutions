class Solution {
    public boolean makeEqual(String[] words) {
        int n=words.length;

        int[] arr=new int[26];
        int lenSum=0;
        for(String s:words){
            lenSum+=s.length();
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                arr[c-'a']++;
            }
        }
        if(lenSum%n!=0) return false;
        for(int i:arr){
            if(i%n!=0) return false;
        }
        return true;
    }
}