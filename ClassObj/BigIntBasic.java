import java.math.BigInteger;
class BigIntBasic
{
    public static void main(String args[])
    {
        //initializtion
        BigInteger a=new BigInteger("10");
       BigInteger b=new BigInteger("5");
        //arthematic operators
        BigInteger c=a.add(b);
        System.out.println("Addition is "+c);
         BigInteger d=a.subtract(b);
        System.out.println("sub is "+d);
         BigInteger e=a.multiply(b);
        System.out.println("mul is "+e);
         BigInteger f=a.divide(b);
        System.out.println("div is "+f);
         BigInteger g=a.remainder(b);
        System.out.println("rem is "+g);

    }
} 
