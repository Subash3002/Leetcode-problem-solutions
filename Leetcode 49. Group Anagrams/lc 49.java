class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>  mp=new HashMap<>();

        for(String word:strs){
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String srt=new String(ch);

            if(!mp.containsKey(srt)){
                mp.put(srt,new ArrayList<>());
            }
            mp.get(srt).add(word);
        }

        return new ArrayList<>(mp.values());
    }
}