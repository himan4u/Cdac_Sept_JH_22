class STP16 {
    public static void main(String[] args) {


        for(int i =1;i<=5;i++)
        {
            for(int j=(5-i);j>=1;j--)
            {

                System.out.print(" ");
            }

            for(int k=1;k<=i;k++)
            {

                  if(i==3&&k==2 || i==4 && k==2 ||i==4&&k==3) {
                      System.out.print(" ");
                  }
                  else
                      System.out.print("*");
            }
            System.out.println();
        }
    }
}
