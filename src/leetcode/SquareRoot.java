package leetcode;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(8));
    }
    public static int mySqrt(int x) {
        int s = x/2;
        int res =1;
        while(s > 1){
            res = s*s;
            if(res == x){

                break;
            }
            s--;
        }
        return s;
    }
}
