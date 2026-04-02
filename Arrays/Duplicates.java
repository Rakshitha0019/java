<<<<<<< HEAD
import java.util.Arrays;
import java.util.Scanner;

class Duplicates {
    public static void main(String Args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter n value");
       int n=sc.nextInt();
       int found=0;
       int[] nums=new int[n];
       System.out.println("enter"+ n + " value into array");
       for(int i=0;i<n;i++)
       {
        nums [i] =sc.nextInt();
       }
        Arrays.sort(nums);
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
               found=1;
               break;
            }
            
            
        }
        if(found==1)
        {
          System.out.println("Duplicates found"); 
        }
        else
         System.out.println(" no Duplicates found"); 
        
      
    }
=======
import java.util.Arrays;
import java.util.Scanner;

class Duplicates {
    public static void main(String Args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter n value");
       int n=sc.nextInt();
       int found=0;
       int[] nums=new int[n];
       System.out.println("enter"+ n + " value into array");
       for(int i=0;i<n;i++)
       {
        nums [i] =sc.nextInt();
       }
        Arrays.sort(nums);
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
               found=1;
               break;
            }
            
            
        }
        if(found==1)
        {
          System.out.println("Duplicates found"); 
        }
        else
         System.out.println(" no Duplicates found"); 
        
      
    }
>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
}