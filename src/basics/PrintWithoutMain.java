package basics;

import java.util.ArrayList;

public class PrintWithoutMain {

    static final int a =10;

    public static boolean printVal(){
        System.out.println("Hello World");
        return true;
    }
    static boolean b = printVal();

    public void mix(byte a, byte b)
    {
        System.out.println("First method");
    }
//type promotion
    public void mix(int a, int b)
    {
        System.out.println("Second Method");
    }

//    public void mix(char a, char b)
//    {
//        System.out.println("Second Method");
//    }

    public static void main(String[] args) {
        PrintWithoutMain pwm = new PrintWithoutMain();
        pwm.mix((byte)10,(byte)20);
        pwm.mix('a','b');
//        main(9);
//        //a=15;
//        System.out.println(a);
       // ArrayList<PrintWithoutMain> test = new ArrayList<PrintWithoutMain>();

    }
    public static void main(int i) {
        System.out.println(i);

        // ArrayList<PrintWithoutMain> test = new ArrayList<PrintWithoutMain>();

    }
}
