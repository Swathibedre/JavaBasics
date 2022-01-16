package amuthan.exceptionhandling;

public class ThrowsException
{
    public static void main(String[] args) throws InterruptedException {
       testadd();
    }
    public  static  void testadd() throws InterruptedException {
        System.out.println("hi");
        Thread.sleep(800);
    }
}
