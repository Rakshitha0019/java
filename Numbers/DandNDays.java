class DandNDays{
    public static void main(String[] args)
    {

        
        int d = 3; 
        int n = 11;

        String[] days
            = { "Sunday",    "Monday",   "Tuesday",
                "Wednesday", "Thursday", "Friday",
                "Saturday" };

        int offset = n % 7;
        int result = d - offset;

        if (result < 0) {
            result += 7;
        }

        System.out.println(days[result]);
    }
}