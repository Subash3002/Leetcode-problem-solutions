class Solution {
    public int fib(int n) {
        return fibb(n)
    }

    int fibb(int n){
        if(n==1 || n==2){
            return 1;
        }
        return fibb(n-1)+fib(n-2);
    }
}