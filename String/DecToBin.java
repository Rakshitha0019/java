<<<<<<< HEAD
class DecToBin
{
    // function to convert decimal to binary
    static void decToBinary(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[1000];
 
        // counter for binary array
        int i = 0;
        while (n > 0) 
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
 
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
    
    
    public static void main (String[] args) 
    {
        int n = 17;
          System.out.println("Decimal - " + n);
        System.out.print("Binary - ");
          decToBinary(n);
    }
=======
class DecToBin
{
    // function to convert decimal to binary
    static void decToBinary(int n)
    {
        // array to store binary number
        int[] binaryNum = new int[1000];
 
        // counter for binary array
        int i = 0;
        while (n > 0) 
        {
            // storing remainder in binary array
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
 
        // printing binary array in reverse order
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
    
    
    public static void main (String[] args) 
    {
        int n = 17;
          System.out.println("Decimal - " + n);
        System.out.print("Binary - ");
          decToBinary(n);
    }
>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
}