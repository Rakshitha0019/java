import java.util.Scanner;
public class BestProfit{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n value");
        int n=sc.nextInt();
        int price[]=new int[n];
        System.out.println("enter"+ n + "value into array");
        for(int j=0;j<n;j++)
        {
            price[j]=sc.nextInt();
        }
        int minpri=price[0];
        int maxpro=0;
        for(int i =1;i<n;i++)
        {
            int profit=price[i]-minpri;
            if(profit>maxpro)
            {
                maxpro=profit;
            }
            if(price[i]<minpri)
            minpri=price[i];
        }
        System.out.println("maximun profit:" + maxpro);

        
    }
}