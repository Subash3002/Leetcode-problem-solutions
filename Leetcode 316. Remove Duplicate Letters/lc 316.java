class Solution {
    public String removeDuplicateLetters(String s) {
        int[] frequency=new int[26];
        boolean[] seen=new boolean[26];

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            frequency[ch-'a']+=1;
        }

        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            frequency[ch-'a']--;
            if(seen[ch-'a']) continue;

            while(!stack.isEmpty() && stack.peek()>ch && frequency[stack.peek()-'a']>0){
                seen[stack.pop()-'a']=false;

            }

            stack.push(ch);
            seen[ch-'a']=true;

        }

        StringBuilder sb=new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        sb=sb.reverse();
        return sb.toString();

    }
}