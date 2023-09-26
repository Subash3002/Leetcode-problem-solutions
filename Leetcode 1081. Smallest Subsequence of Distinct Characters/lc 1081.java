class Solution {
    public String smallestSubsequence(String s) {
        Stack<Character> stack=new Stack<>();
        int[] frequency=new int[26];
        boolean[] seen=new boolean[26];

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            frequency[c-'a']++;
        }

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            frequency[c-'a']--;
            if(seen[c-'a']) continue;

            while(!stack.isEmpty() && stack.peek()>c && frequency[stack.peek()-'a']>0){
                seen[stack.pop()-'a']=false;
            }
            stack.push(c);
            seen[c-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
}