package amuthan.bank;

public class TestBank {
    public static void main(String[] args) {
        SBI  sbi = new SBI(5.5);
        System.out.println(sbi.roi);
        sbi.withdraw();
    }
}
