import java.util.Scanner;
class VowelSwap 
{
    public static void main (String args[]) 
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter a string");
        String s=sc.nextLine();
        char []arr=s.toCharArray();
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<=j)
        {
            if((arr[i]!='A') && (arr[i]!='a') && (arr[i]!='E') && (arr[i]!='e') && (arr[i]!='I') && (arr[i]!='i') && (arr[i]!='O') && 
                 (arr[i]!='o') && (arr[i]!='U') && (arr[i]!='u') )
            {
                i++;
                continue;
            }
           if((arr[j]!='A') && (arr[j]!='a') && (arr[j]!='E') && (arr[j]!='e') && (arr[j]!='I') && (arr[j]!='i') && (arr[j]!='O') && 
                 (arr[j]!='o') && (arr[j]!='U') && (arr[j]!='u') )
            {
                j--;
                continue;
            }
            char temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
             i++;
             j--;
        }
        String st=new String(arr);
        System.out.println(st);
    }
}