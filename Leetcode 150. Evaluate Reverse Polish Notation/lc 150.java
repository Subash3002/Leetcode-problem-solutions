class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> num=new Stack<>();

        for(String s:tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                int num1=num.pop();
                int num2=num.pop();
                int ans=0;
                char c=s.charAt(0);
                switch(c){
                    case '+':
                        ans=num1+num2;
                        break;
                    case '-':
                        ans=num2-num1;
                        break;
                    case '*':
                        ans=num2*num1;
                        break;
                    case '/':
                        ans=num2/num1;
                        break;
                }
                num.push(ans);
            }else{
                int n=Integer.valueOf(s);
                num.push(n);
            }

        }
        return num.pop();
    }
}