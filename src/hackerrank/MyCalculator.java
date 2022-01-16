package hackerrank;

public   class MyCalculator implements AdvancedArithmetic{
        public int divisor_sum(int n){
            int i =2;
            int res=1;
            while(i<=n){
                if(n%i==0){
                    res += i;
                }
                i++;
            }
            return res;
        }
    }


