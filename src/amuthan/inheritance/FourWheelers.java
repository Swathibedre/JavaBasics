package amuthan.inheritance;

public class FourWheelers extends  Vehicles{

 static int b =10;
    protected FourWheelers(String s) {
        super(s);

    }
    public static void test(){

        System.out.println("car speed");
    }

    public int a() {
        return 0;
    }

    public void speed(int vel, int time){
        //super.speed(vel,time);
        System.out.println(vel+" child "+time);
    }

    public void speed1(int vel, int time){

        System.out.println(vel+" child "+time);
    }

}
