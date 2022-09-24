public class P6 {
    public static void main(String[] args) {


        int i, j, row = 9;

        for (i = 0; i <= row; i++) {

            for (j =0; j <=i; j++) {

                System.out.print(" ");
            }


            for (int k = 0; k <= row-i; k++) {

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}