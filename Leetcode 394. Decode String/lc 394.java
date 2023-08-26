class Solution {
    public String decodeString(String s) {
        Stack<String> wordStack=new Stack<>();
        Stack<Integer> numStack=new Stack<>();
        int num=0;
        StringBuilder word=new StringBuilder();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isDigit(c)){
                num=num*10+(c-'0');
            }
            else if(Character.isLetter(c)){
                word.append(c);
            }
            else if(c=='['){
                wordStack.push(word.toString());
                numStack.push(num);
                num=0;
                word=new StringBuilder();
            }
            else{
                int count=numStack.pop();
                StringBuilder repeatedWord=new StringBuilder(wordStack.pop());
                for(int j=0;j<count;j++){
                    repeatedWord.append(word);
                }
                word=repeatedWord;
            }
        }
        return word.toString();
    }
}