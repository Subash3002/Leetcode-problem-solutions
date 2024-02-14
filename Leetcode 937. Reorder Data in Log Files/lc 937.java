class Solution {
    public String[] reorderLogFiles(String[] logs) {
        int n=logs.length;
        String[] identifiers=new String[n];
        String[] contents=new String[n];
        List<String> dig=new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] parts=logs[i].split(" ",2);
            identifiers[i]=parts[0];
            contents[i]=parts[1];
        }
        Map<String,List<String>> map=new TreeMap<>();
        for(int i=0;i<n;i++){
            if(contents[i].charAt(0)>='0' && contents[i].charAt(0)<='9'){
                dig.add(logs[i]);
                continue;
            }
            if(map.containsKey(contents[i])){
                List<String> arr=map.get(contents[i]);
                arr.add(identifiers[i]);
                map.put(contents[i],arr);
            }else{
                List<String> arr=new ArrayList<>();
                arr.add(identifiers[i]);
                map.put(contents[i],arr);
            }
        }
        List<String> ans=new ArrayList<>();
        for(String s:map.keySet()){
            
            //System.out.println(s);
            List<String> arr=map.get(s);
            Collections.sort(arr);
            for(int i=0;i<arr.size();i++){
                ans.add(arr.get(i)+" "+s);
            }  
        }

        
        System.out.println(ans);
        System.out.println(dig);

        String[] res=new String[n];
        int i=0;
        for(;i<ans.size();i++)res[i]=ans.get(i);
        for(int j=0;j<dig.size();j++)res[i+j]=dig.get(j);
            
        return res;
    }
}