package amuthan.bank;

public abstract class RBI {
    public  double roi;
    public RBI(){
        System.out.println("Default const");
    }
    public RBI(double roi){
        this.roi = roi;
    }


    public   void withdraw(){
        System.out.println("SUper withdraw");
    };
    public abstract void deposit();

}
