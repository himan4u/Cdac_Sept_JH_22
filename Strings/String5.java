class String5
{
    static boolean onlyDigits(String str,int length)
    {
        for(int i=0;i<length;i++)
        {
            if(str.charAt(i)<'0'||str.charAt(i)>'9')
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "1234Ab";
        int len = str.length();
         boolean result = onlyDigits(str,len);
         if(!result)
         {
             System.out.println("the string does not contain all numbers");
         }
         else
             System.out.println("the string contains all numbers ");
    }
}