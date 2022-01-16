package amuthan;

public class TwoDimensionalArray {

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{3,4,5}};
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }
        int[][] b = new int[2][3];
        b[0][0] = 2;

        Object[][] o = new Object[2][2];
        o[0][0] = "jo";
        o[0][1] =1;
    }
}
