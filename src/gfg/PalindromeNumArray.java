package gfg;

public class PalindromeNumArray {
    public static void main(String[] args) {
        int a[] = { 111, 222,333,444,555 };
        int n =5;
        System.out.println(palinArray(a, n));

    }

    public static int palinArray(int[] a, int n)
    {
        //add code here.
        int res = 0;

        int  temp[] = a.clone();
        for (int i = 0; i < a.length; i++){
            int r = 0,sum =0;
            while(a[i]>0){
                r = a[i] % 10;
                sum = (sum * 10) + r;
                a[i] = a[i] / 10;
                }
            a[i] = sum;
        }

        for(int i = 0; i < n; i++){
            if(!(a[i] == temp[i])){
                res = 0;
                break;
            }
            else res =1;
        }

       return res;
    }
}
