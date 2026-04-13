public class MinDistanceToTarget {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5};
        int target = 5;
        int start = 3;

        int min = 1000000; // large number

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {

                int distance;

                // calculate distance manually
                if (i > start) {
                    distance = i - start;
                } else {
                    distance = start - i;
                }

                // update minimum distance
                if (distance < min) {
                    min = distance;
                }
            }
        }

        System.out.println("Minimum Distance: " + min);
    }
}