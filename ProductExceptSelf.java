import java.util.*;

class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        //if the array is only two numbers, you can just return it
        if(nums.length <= 2) {
            return new int[]{nums[1], nums[0]};
        }
        else {
            //we need to find all of the products to the left and right of each
            //number in the original array
            //once we've found the products of all the left and all the right,
            //we can multiply those two together and get the final products

            //create integers for left, right, and the final products
            // int[] left = new int[nums.length];
            // int[] right = new int[nums.length];

            //use ans to hold left, then prod with right
            int[] ans = new int[nums.length];

            //set the beginning and end values to 1 since nothing is to the left
            //or the right of each of those
            // left[0] = 1;
            // right[nums.length - 1] = 1;
            ans[0] = 1;

            //loop through each side starting after initial from above
            for(int i = 1; i < nums.length; i++) {
                ans[i] = ans[i - 1] * nums[i - 1];
            }

            // ans[nums.length - 1] = ans[nums.length - 1] * 1;
            int right = 1;
            //minus 2 to start at second to last
            for(int i = nums.length - 1; i >= 0; i--) {
                ans[i] *= right;
                right *= nums[i];
            }

            //multiply left and right
            // for(int i = 0; i < nums.length; i++) {
            //     ans[i] = left[i] * right[i];
            // }
            return ans;
        }
    }

    public static void print(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        print(productExceptSelf(a));
    }
}
