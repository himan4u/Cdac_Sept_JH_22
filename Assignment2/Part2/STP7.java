public class STP7 {
    public static void main(String[] args) {
        int i, j, row = 5;
        for (i = 0; i < row; i++) {

            for (j = row - i; j > 1; j--) {

                System.out.print(" ");
            }

            for (j = 0; j <= i; j++) {

                System.out.print("* ");
            }

            System.out.println();
        }

        for (int z = 0; z <= row - 1; z++) {
            for (int x = 0; x <= z; x++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= row - 1 - z; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}



