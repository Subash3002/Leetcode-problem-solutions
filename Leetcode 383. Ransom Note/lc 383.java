class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] r=ransomNote.toCharArray();
        char[] m=magazine.toCharArray();

        Arrays.sort(r);
        Arrays.sort(m);
        int ind=0;
        for(int i=0;i<m.length;i++){
            if(r[ind]== m[i]){
                ind++;
            }  
            if(ind==r.length) return true; 
        }
        return false;
    }
}