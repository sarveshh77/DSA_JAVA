public class pattern3 
{
    public void pattern()
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        pattern3 obj = new pattern3();
        obj.pattern();
    }
}
