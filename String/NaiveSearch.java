<<<<<<< HEAD

public class NaiveSearch {

    static void search(String pat, String txt)
    {
        int l1 = pat.length();
        int l2 = txt.length();
        int i = 0, j = l2 - 1;

        for (i = 0, j = l2 - 1; j < l1;) {

            if (txt.equals(pat.substring(i, j + 1))) {
                System.out.println("Pattern found at index "+ i);
            }
            i++;
            j++;
        }
    }
    public static void main(String args[])
    {
        String pat = "AABAACAADAABAAABAA";
        String txt = "AABA";
        search(pat, txt);
    }
}
=======

public class NaiveSearch {

    static void search(String pat, String txt)
    {
        int l1 = pat.length();
        int l2 = txt.length();
        int i = 0, j = l2 - 1;

        for (i = 0, j = l2 - 1; j < l1;) {

            if (txt.equals(pat.substring(i, j + 1))) {
                System.out.println("Pattern found at index "
                                + i);
            }
            i++;
            j++;
        }
    }
    public static void main(String args[])
    {
        String pat = "AABAACAADAABAAABAA";
        String txt = "AABA";
        search(pat, txt);
    }
}
>>>>>>> efd6f2ac5f6ee266f448d189799f8aeb70e9e655
