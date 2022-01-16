package leetcode;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(1147483648));
    }

            public static int reverse(int x) {

                int result =0;

                while(x!=0)
                {
                    int rem = x%10;
                    x =x/10;
                    int temp = result*10+rem;
                    if(result!=(temp)/10){
                        System.out.println((temp)/10);
                        System.out.println(result);
                        return 0;
                    }
                    result = temp;
                }
                return result;
            }


}
