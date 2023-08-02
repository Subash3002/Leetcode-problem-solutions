class Solution {
    public int minPartitions(String n) {
        char[] ch=n.toCharArray();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ch.length;i++){
            
            max=Math.max(max, (int) ch[i] - '0' );
        }
        return max;
    }
}