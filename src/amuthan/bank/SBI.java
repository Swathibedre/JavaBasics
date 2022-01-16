package amuthan.bank;

public class SBI extends RBI{

    public  SBI(){

      super();
    }

    public  SBI(double roi){
        super();
        System.out.println(roi);
    }
    @Override
    public void withdraw() {
        super.withdraw();
        System.out.println("SBI withdraw");
    }

    @Override
    public void deposit() {
        System.out.println("SBI deposit");
    }
}
