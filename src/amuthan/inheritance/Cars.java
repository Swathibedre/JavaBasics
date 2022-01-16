package amuthan.inheritance;

public class Cars extends  FourWheelers{
    protected Cars(String s) {

        super(s);
    }

    public void speed(int vel, int time){
        super.speed(vel,time);
        System.out.println(vel+" granchild "+time);
    }


    public static void test(){

        System.out.println("car speed");
    }

}
