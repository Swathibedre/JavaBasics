package amuthan;

public class LargestNumber {
    public static void main(String[] args) {
        int a = 10 , b = 15, c =5;

        if(a > b && a > c){
            System.out.println("a is largest number " +a);
        }
        else if( b > c){
            System.out.println("b is largest number " +b);
        }
        else{
            System.out.println("c is largest number " +c);
        }
    }
}
