package amuthan.exceptionhandling;

public class ExceptionTest
{
    public static void main(String[] args) {
       dividezero();
    }

    public static  void dividezero() {
        try {
            System.out.println(1 / 0);
            System.out.println("not executed");
        }
        //way to recover diff errors
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //will be executed-can be used for cleanup/close connection/ driver close
        finally {
            System.out.println("Finally block");
        }
    }
}
