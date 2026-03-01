import java.util.Scanner;
class MoveZero {
    public static void main(String args[]) {
        
        System.out.print("enter    n    numbers"+"  ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]nums=new int[n];
       
       
        System.out.print("enter"+ n+ "numbers  ");
        for(int k=0;k<n;k++)
        {
          nums[k]=sc.nextInt();
        }
        
        int j=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=0)
            {
                nums[j]=nums[i];
                j++;
            }
        }
        while(j<n)
        {
            nums[j]=0;
            j++;
        }
        for(int k=0;k<n;k++)
        {
           System.out.println(nums[k]);
        }
        
    }
}