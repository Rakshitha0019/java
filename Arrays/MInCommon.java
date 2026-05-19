class MinCommon
{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5};
        int b[]={3,2,1};
        int n=a.length;
        int m=b.length;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(a[i]==b[j])
                {
                  min=Math.min(min,a[i]);
                }
            }
        }
        System.out.println("Minimum common value is: "+min);
    }
}