class TwoDigitTarget{
    public static void main(String args[])
    {
        int []nums={2,5,7,8,1};
        int target=6;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    System.out.println("Traget obtain by adding values in {" + i +","+ j+"} index of array");
                }
            }
        }
       
    }
}