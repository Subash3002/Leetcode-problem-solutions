class Solution {
    static String ans;
    boolean compare(int[] a,int[] b){
        for(int i=0;i<52;i++){
            if(b[i]<a[i]) return false;
        }
        return true;
    }
    boolean solve(String s,int[] a,int mid){
        int i=0;
        int j=0;
        int[] b=new int[52];
        while(j<s.length()){
            char c=s.charAt(j);
            if(c>='a' && c<='z'){
                b[c-'a']++;
            }else{
                b[c-'A'+26]++;
            }

            if(j-i+1==mid){
                if(compare(a,b)){
                    ans=s.substring(i,j+1);
                    return true;
                }
                char ch=s.charAt(i);
                if(ch>='a' && ch<='z'){
                    b[ch-'a']--;
                }else{
                    b[ch-'A'+26]--;
                }
                i++;
            }
            j++;
        }
        return false;

    }
    public String minWindow(String s, String t) {
        ans="";
        if(s.length()<t.length()) return ans;
        
        int[] a=new int[52];
        
        for(int i=0;i<t.length();i++){
            char c=t.charAt(i);
            if(c>='a' && c<='z'){
                a[c-'a']++;
            }else{
                a[c-'A'+26]++;
            }
        }

        int l=t.length();
        int h=s.length();

        while(l<=h){
            int mid=l+(h-l)/2;

            if(solve(s,a,mid)){
                h=mid-1;
            }else{
                l=mid+1;
            }
        }

        return ans;
    }
}