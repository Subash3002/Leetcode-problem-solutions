class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> ans=new ArrayList<>();

        int[] d={0,0,12,123,1234,12345,123456,1234567,12345678,123456789,0};
        int[] a={0,0,11,111,1111,11111,111111,1111111,11111111,111111111,0};



        String l=""+low;
        int n1=l.length();

        String h=""+high;
        int n2=h.length();

        for(int i=n1;i<=n2;i++){
            int start=d[i];
            while(start%10!=0){
                if(start>=low && start<=high){
                    ans.add(start);
                }
                start+=a[i];
                System.out.println(start);
            }
        }

        return ans;


        


    }
}