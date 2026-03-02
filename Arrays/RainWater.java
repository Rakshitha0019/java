class RainWater{
    public static void main(String args[]){
        int []arr={10,3,5,7,8};
        int n = arr.length;
        if (n == 0) 
          System.out.println("valid nums");

        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left <= right) {
            if (arr[left] <= arr[right]) {
                if (arr[left] >= leftMax) {
                    leftMax = arr[left];
                } else {
                    water += leftMax - arr[left];
                }
                left++;
            } else {
                if (arr[right] >= rightMax) {
                    rightMax = arr[right];
                } else {
                    water += rightMax - arr[right];
                }
                right--;
            }
        }

     System.out.println(water);
    }
}
    