class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] res=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            if(st.isEmpty()){
                res[i]=0;
                
            }else{
                while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()]){
                    st.pop();
                }

                if(st.isEmpty()){
                    res[i]=0;
                }else{
                    res[i]=st.peek()-i;
                }
            }
            st.push(i);
        }
        return res;
    }
}