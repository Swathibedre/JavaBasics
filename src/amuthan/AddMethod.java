package amuthan;

public class AddMethod {
    public static void main(String[] args) {
        int a =10,b=30;
        int c =13,d =45;
        add(a,b);
        System.out.println( add(a,b,c));

    }
    static void add(int a, int b){
        System.out.println(a+b);
    }

    static int add(int a, int b,int c){
        return a+b+c;
    }
}
