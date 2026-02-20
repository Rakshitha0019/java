class LargeSol {

    public static String findLargest(int[] arr) {

        String[] s = new String[arr.length];

        for(int i=0;i<arr.length;i++){
            s[i] = String.valueOf(arr[i]);
        }

        java.util.Arrays.sort(s, (a,b) -> {
            String ab = a + b;
            String ba = b + a;
            return ba.compareTo(ab);
        });

        if(s[0].equals("0"))
            return "0";

        StringBuilder ans = new StringBuilder();

        for(int i=0;i<s.length;i++){
            ans.append(s[i]);
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        int[] arr = {3, 30, 34, 5, 9};

        System.out.println(findLargest(arr));

    }
}