class Solution {
public:
    int countNumbersWithUniqueDigits(int n) {
        if(n==0){
            return 1;
        }

        int comb=9;
        int totalComb=10;

        for(int i=0;i<n-1;i++){
            comb*=(9-i);
            totalComb+=comb;
        }
        return totalComb;

    }
};