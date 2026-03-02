class PowerThree {
    public static void main(String args[]) 
    {
        int n=3;
        if (n <= 0) {
           System.out.println("false");
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        System.out.println("true");
  
    }
}