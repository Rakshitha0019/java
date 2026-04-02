<<<<<<< HEAD
import java.util.*;

class CountOfNum {

    
    static int countDigit(int n)
    {
        
        if (n / 10 == 0)
            return 1;

    
        return 1 + countDigit(n / 10);
    }

    public static void main(String[] args)
    {
        int n = 58964;
        System.out.print(countDigit(n)); 
    }
=======
import java.util.*;

class CountOfNum {

    
    static int countDigit(int n)
    {
        
        if (n / 10 == 0)
            return 1;

    
        return 1 + countDigit(n / 10);
    }

    public static void main(String[] args)
    {
        int n = 58964;
        System.out.print(countDigit(n)); 
    }
>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
}