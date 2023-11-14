class Solution {
    public int countPalindromicSubsequence(String s) {
        int ans=0;
        HashMap<Character,int[]> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(hm.containsKey(c)){
                int[] pair=hm.get(c);
                pair[1]=i;
            }else{
                int[] pair={i,-1};
                hm.put(c,pair);
            }
        }

        for(Map.Entry<Character,int[]> m:hm.entrySet()){
            char c=m.getKey();
            int[] arr=m.getValue();
            if(arr[1]>0){
                Set<Character> set=new HashSet<>();
                for(int i=arr[0]+1;i<arr[1];i++){
                    set.add(s.charAt(i));
                }
                ans+=set.size();
            }
        }
        return ans;
    }
}