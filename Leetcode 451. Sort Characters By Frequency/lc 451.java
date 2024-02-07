class Solution {
    public String frequencySort(String s) {
        int[] freq=new int[62];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                freq[(s.charAt(i)-'0')+52]++;
            }
            else if(ch>='a' && ch<='z'){
                freq[(s.charAt(i)-'a')+26]++;
            }else{
                freq[s.charAt(i)-'A']++;
            }
            
        }

        Map<Integer,List<Integer>> hm=new TreeMap<>();

        for(int i=0;i<62;i++){
            if(hm.containsKey(freq[i])){
                List<Integer> arr=hm.get(freq[i]);
                arr.add(i);
                hm.put(freq[i],arr);
            }else{
                List<Integer> arr=new ArrayList<>();
                arr.add(i);
                hm.put(freq[i],arr);
            }
        } 

        StringBuilder sb=new StringBuilder();

        for(int f:hm.keySet()){
            List<Integer> arr=hm.get(f);
            for(int i=0;i<arr.size();i++){
                int ind=arr.get(i);
                for(int j=0;j<f;j++){
                    if(ind<26){
                        sb.append((char)(arr.get(i)+'A'));
                    }else if(ind<52){
                        sb.append((char)((arr.get(i)-26)+'a'));
                    }else{
                        sb.append((char)((arr.get(i)-52)+'0'));
                    }
                    
                }
            }
        }

        return sb.reverse().toString();
    }
}