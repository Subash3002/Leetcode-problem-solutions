class Solution {
    public int minimumSum(int num) {
        int num1=0;
        int num2=0;

        int[] numarr=new int[4];
        int n=num;
        int i=0;
        while(n>0){
            numarr[i]=n%10;
            i++;
            n=n/10;
        }

        Arrays.sort(numarr);
        num1=numarr[0]*10 + numarr[2];
        num2=numarr[1]*10 + numarr[3];

        return num1 + num2;
    }
}