class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            int curAsteroid=asteroids[i];
            while(!stack.isEmpty() && curAsteroid<0 && stack.peek()>0){
                int diff=curAsteroid+stack.peek();

                if(diff<0){
                    stack.pop();
                }
                else if(diff>0){
                    curAsteroid=0;
                }
                else{
                    stack.pop();
                    curAsteroid=0;
                }
            }
            if(curAsteroid!=0){
                stack.push(curAsteroid);
            }
        }
        int[] res=new int[stack.size()];

        for(int i=stack.size()-1;i>=0;i--){
            res[i]=stack.pop();
        }

        return res;
    }
}