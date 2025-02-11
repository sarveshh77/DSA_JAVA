public class pattern6
{
    public void pattern (int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n-i+1;j++)
            {   
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
    public static void main(String args[])
    {
        pattern6 obj = new pattern6();
        obj.pattern(3);
    }
}
