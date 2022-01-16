package amuthan.abstraction;

public class TestAbs
{
    public static void main(String[] args) {
        ParentAbs p = new ParentAbs(8) {
            @Override
            public void happy() {
                super.happy();
            }
        };
    }
}
