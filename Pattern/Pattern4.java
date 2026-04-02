class Pattern4
{
    public static void main(String args[])
    {
        int n=4;
        int i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i+j<=2 || i-j>=-(n/2) || i==n/2)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");

        }

    }
}