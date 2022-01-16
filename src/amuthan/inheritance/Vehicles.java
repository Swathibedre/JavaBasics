package amuthan.inheritance;

public class Vehicles {
    public int wheels;

    public Vehicles(String s){
        System.out.println("Param constructor "+s);
    }

    //public  Vehicles(){}


    public void speed(int vel, int time){
        System.out.println(vel+" "+time);
    }

    public void engine(int vel, int time){
        System.out.println(vel+" "+time);
    }
}
