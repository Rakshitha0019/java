public class Reverse{
    public static void main(String[] args) {
        char[] arr = {'H', 'e', 'l', 'l', 'o'};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println(arr);
    }
}