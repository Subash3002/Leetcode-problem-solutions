class Solution {
    public int largestInteger(int num) {
        ArrayList<Integer> nums=new ArrayList<>();

        int n=num;
        
        while(num>0){
            nums.add(num%10);
            num=num/10;
        }

        Collections.reverse(nums);

        for(int i=0;i<nums.size();i++){
            if(nums.get(i)%2==0){
                for(int j=i+1;j<nums.size();j++){
                    if(nums.get(j)%2==0 && nums.get(j)>nums.get(i)){
                        int temp=nums.get(i);
                        nums.set(i,nums.get(j));
                        nums.set(j,temp);
                    }
                }
            }
            else{
                for(int j=i+1;j<nums.size();j++){
                    if(nums.get(j)%2!=0 && nums.get(j)>nums.get(i)){
                        int temp=nums.get(i);
                        nums.set(i,nums.get(j));
                        nums.set(j,temp);
                    }
                }
            }
        }

        

        int len=nums.size();
        int res=0;
        for(int k=0;k<len;k++){
            res+=nums.get(k) * Math.pow(10,(len-1-k));
        }

        return res;



    }
}