class Solution {
    public List<Integer> survivedRobotsHealths(int[] positions, int[] healths, String directions) {
        Map<Integer,List<Integer>> mp=new TreeMap<>();
        int n=positions.length;
        for(int i=0;i<n;i++){
            int pos=positions[i];
            int helth=healths[i];
            int d=(directions.charAt(i)=='R')?1:0;
            List<Integer> val=new ArrayList<>();
            val.add(helth);
            val.add(d);
            val.add(i);
            mp.put(pos,val);
        }

        Stack<List<Integer>> st=new Stack<>();
        for(int k:mp.keySet()){
            List<Integer> arr=new ArrayList<>(mp.get(k));
            arr.add(k);
            int d=arr.get(1);
            int health=arr.get(0);
            System.out.println(k);
            while(!st.isEmpty() && st.peek().get(1)==1 && d==0 ){
                //System.out.println("peek ="+st.peek());
                if(health>st.peek().get(0)){
                    health-=1;
                    st.pop();
                    
                }else if(health<st.peek().get(0)){
                    health=0;
                    List<Integer> l=new ArrayList<>(st.pop());
                    l.set(0,l.get(0)-1);
                    st.push(l);
                    //System.out.println(st);
                    break;
                }else{
                    health=0;
                    st.pop();
                    break;
                }
            }
            if(health>0){
                arr.set(0,health);
                st.push(arr);
                //System.out.println(arr);
            }


        }

        int[] ans=new int[n];

        while(!st.isEmpty()){
            List<Integer> arr=new ArrayList<>(st.pop());
            //System.out.println(arr);
            int ind=arr.get(2);
            int health=arr.get(0);
            ans[ind]=health;
        }
        List<Integer> res=new ArrayList<>();
        for(int i:ans){
            if(i!=0)res.add(i);
        }
        //System.out.println(Arrays.toString(ans));

        return res;
    }
}