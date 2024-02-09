class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n=students.length;
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<students.length;i++){
            q.add(students[i]);
        }
        int ind=0;
        int ops=0;
        while(ind<n && ops<q.size()){
            int val=q.remove();
            if(sandwiches[ind]!=val){
                q.add(val);
                ops++;
                
            }
            else{
                ind++;
                ops=0;
            }
        }
        return q.size();
    }
}