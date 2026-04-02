<<<<<<< HEAD
public class Ranfun{
    public static void main(String args[])
    {
        int a[][]=new int[3][];//jagged arrays
        // 3 reperesnt no.of smallarrys in it ,and  4 represent no.ele in each array..here 4 is not fixed.which means we can hav n nummber of elements in those 3 arrays
         //math.random is function used to give random valuess,it give double and vals which are less than1.0..so as it double vale we give type cast that double into int and as it gives leas than 1.0..we* with 100                          
           a[0]=new int[3];//no.oh ele in 1st arr
            a[1]=new int[5];
             a[2]=new int[4];

          for(int i=0;i<3;i++)//rows
          {
            for(int j=0;j<4;j++)//columns
            {
                a[i][j]=(int)(Math.random()*100);

                
            }
          }
           
          for( int i=0;i<3;i++)//rows
          {
            for(int j=0;j<4;j++)//columns
            {
               

                System.out.print(a[i][j]+" ");
            }
            System.out.println();
         }
         //****orrr we use enhanced for loop */
         for(int n[]:a)
         //n represent single dimentional array from array a
         {
            for(int m:n)
            {
                System.out.print(m+"  ");
            }
            System.out.println();

         }

     }                            
=======
public class Ranfun{
    public static void main(String args[])
    {
        int a[][]=new int[3][];//jagged arrays
        // 3 reperesnt no.of smallarrys in it ,and  4 represent no.ele in each array..here 4 is not fixed.which means we can hav n nummber of elements in those 3 arrays
         //math.random is function used to give random valuess,it give double and vals which are less than1.0..so as it double vale we give type cast that double into int and as it gives leas than 1.0..we* with 100                          
           a[0]=new int[3];//no.oh ele in 1st arr
            a[1]=new int[5];
             a[2]=new int[4];

          for(int i=0;i<3;i++)//rows
          {
            for(int j=0;j<4;j++)//columns
            {
                a[i][j]=(int)(Math.random()*100);

                
            }
          }
           
          for( int i=0;i<3;i++)//rows
          {
            for(int j=0;j<4;j++)//columns
            {
               

                System.out.print(a[i][j]+" ");
            }
            System.out.println();
         }
         //****orrr we use enhanced for loop */
         for(int n[]:a)
         //n represent single dimentional array from array a
         {
            for(int m:n)
            {
                System.out.print(m+"  ");
            }
            System.out.println();

         }

     }                            
>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
}  