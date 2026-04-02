<<<<<<< HEAD
class ArrayPlusOne {
    public static void main(String args[])
    {
        int[] digits={1,2,3,4};
        int sum=0;
        int n=digits.length;
        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                for(int j=0;j<n;j++)
                {
                    System.out.print(digits[j]+" ");
                }
                return;
                
            }
            digits[i]=0;

        }
        int[] newArr=new int[n+1];
        newArr[0]=1;
       
           for(int i=0;i<n;i++)
           {
            System.out.print(newArr[i]+" ");
           }
        

    }
=======
class ArrayPlusOne {
    public static void main(String args[])
    {
        int[] digits={1,2,3,4};
        int sum=0;
        int n=digits.length;
        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]++;
                for(int j=0;j<n;j++)
                {
                    System.out.print(digits[j]+" ");
                }
                return;
                
            }
            digits[i]=0;

        }
        int[] newArr=new int[n+1];
        newArr[0]=1;
       
           for(int i=0;i<n;i++)
           {
            System.out.print(newArr[i]+" ");
           }
        

    }
>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
}