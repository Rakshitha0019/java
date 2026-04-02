<<<<<<< HEAD

import java.util.*;
import java.lang.*;

public class FirstLast{

    public static int firstDigit(int n)
    {
        while (n >= 10) 
            n /= 10;
    
        
        return n;
    }

    
    public static int lastDigit(int n)
    {
        
        return (n % 10);
    }
    
    public static void main(String argc[])
    {
        int n = 98562;
        System.out.println(firstDigit(n) + " " + lastDigit(n));
    }
}

=======

import java.util.*;
import java.lang.*;

public class FirstLast{

    public static int firstDigit(int n)
    {
        while (n >= 10) 
            n /= 10;
    
        
        return n;
    }

    
    public static int lastDigit(int n)
    {
        
        return (n % 10);
    }
    
    public static void main(String argc[])
    {
        int n = 98562;
        System.out.println(firstDigit(n) + " " + lastDigit(n));
    }
}

>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
