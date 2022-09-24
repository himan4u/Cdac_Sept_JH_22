public class P3 {
    public static void main(String[] args) {


        int i, j, row = 9;

        for (i = 0; i <= row; i++) {

            for (j =(row - i); j >= 0; j--) {

                System.out.print(" ");
            }

            for (int k = 0; k < i; k++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}