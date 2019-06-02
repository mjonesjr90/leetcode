import java.util.*;

class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int ans = 0;

        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] == nums[j]) {
                    ans = nums[i];
                    break;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        FindDuplicate fd = new FindDuplicate();

        int[] a = {1, 3, 4, 2, 2};
        int[] b = {3, 1, 3, 4, 2};

        System.out.println("DUPLICATE IN A: " + fd.findDuplicate(a));
        System.out.println("DUPLICATE IN B: " + fd.findDuplicate(b));
    }
}
