class Solution {
    public int minimumLength(String s) {
        int n=s.length();
        int l=0;
        int h=n-1;

        while(l<h && s.charAt(l)==s.charAt(h)){
            char c=s.charAt(l);
            while(l<=h && s.charAt(l)==c)l++;
            while(l<=h && s.charAt(h)==c)h--;
        }

        return h-l+1;
    }
}