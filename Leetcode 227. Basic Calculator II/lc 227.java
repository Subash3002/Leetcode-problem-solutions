class Solution {
    public int calculate(String s) {
        int ans=0;

        Stack<Integer> st=new Stack<>();
        char prevOp='+';
        int num=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i); 
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            if(c=='+' || c=='-' || c=='*' || c=='/' || i==s.length()-1){
                
                if(prevOp=='+'){
                    st.push(num);
                }
                if(prevOp=='-'){
                    st.push(-num);
                }
                if(prevOp=='*'){
                    st.push(st.pop()*num);
                }
                if(prevOp=='/'){
                    st.push(st.pop()/num);
                }
                        
                num=0;
                prevOp=c;
            }

        }
        while(!st.isEmpty()){
            System.out.println(st.peek());
            ans+=st.pop();
        }
        return ans;
    }
}