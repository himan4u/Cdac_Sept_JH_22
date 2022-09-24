public class STP9 {
    public static void main(String[] args) {
        int i, j, row = 5;

        for (i = 0; i <= row; i++) {

            for (j = 2*(row - i)-1; j >= 0; j--) {

                System.out.print(" ");
            }

            for (j = 0; j <= i; j++) {

                System.out.print("* ");


            }
            System.out.println();
        }


            for (int z = 0; z <= 5; z++) {
                for (int x = 0; x <=z; x++) {
                    System.out.print("  ");
                }
                for(int t=1;t<=5-z;t++)
                {
                    System.out.print("* ");
                }

                System.out.println();



        }
    }
}