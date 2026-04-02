<<<<<<< HEAD
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
=======
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
>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
}