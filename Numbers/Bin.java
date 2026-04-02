class Bin
{
    public static void main(String args[])
    {
        int n=5;
        int x=0;
        intt a=1;
        while (n>0)
        {
            x=x+(n%10)*a;
            a=a*2;
            n=n/10;
        }
    }
}