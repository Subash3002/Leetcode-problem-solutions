class Solution {
    public String simplifyPath(String path) {
        String ans="";
        Stack<String> st=new Stack<>();
        int n=path.length();
        //for(String s:arr)System.out.println(s);

        for(int i=0;i<n;++i){
            if(path.charAt(i)=='/')continue;
            String temp="";

            while(i<n && path.charAt(i)!='/'){
                temp+=path.charAt(i);
                ++i;
            }
            if(temp.equals(".")){
                continue;
            }
            else if(temp.equals("..")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(temp);
            }
        }
        while(!st.isEmpty()){
            
            ans="/"+st.pop()+ans;
        }
       return ans.isEmpty()==true?"/":ans;
    }
}