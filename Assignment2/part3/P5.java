class P5{
	public static void main(String[] args) {



        int i, j, row = 9;

        for (i=0; i<row; i++)
        {

            for (j=2*(row-i); j>=0; j--)
            {

                System.out.print(" ");
            }

            for (j=i; j>=0; j-- )
            {

                System.out.print(row-j+" ");
            }
            for (j=1; j<=i; j++ )
            {

                System.out.print(row-j+" ");
            }



            System.out.println();
        }
    }
}
