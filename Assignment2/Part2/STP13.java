public class STP13 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= (5 - i); k++) {
                System.out.print("* ");
            }

            System.out.println();



        }
        for (int x = 1; x <=5; x++) {

            for (int j = 2 * (5 - x)+1; j >= 0; j--) {

                System.out.print(" ");
            }

            for (int c = 1; c <= x; c++) {

                System.out.print("* ");


            }
            System.out.println();


        }
    }
}
