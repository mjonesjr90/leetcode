public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int ans = 0;
        if(nums == null || nums.length == 0) {
            return 0;
        }
        else {
            for(int i = 0; i < nums.length; i++) {
                // System.out.println("COMPARING: " + target + " and " + nums[i]);
                if(target <= nums[i]) { //account for first location in array
                    // System.out.println(target + " less than or equal " + nums[i]);
                    if((i - 1) < 0) {
                        ans = 0;
                    }
                    else {
                        ans = i;
                    }
                    break;
                }
                if(target > nums[i] && (i + 1) == nums.length) { //end of array
                    // System.out.println(target + " greater than " + nums[i] + " and REACHED END");
                    ans =nums.length;
                    break;
                }
                // System.out.println(target + " greater than " + nums[i]);
                //continue to move on if none of the criteria above is met
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        System.out.println("Example 1: " + searchInsert(arr, 5));
        System.out.println("Example 2: " + searchInsert(arr, 2));
        System.out.println("Example 3: " + searchInsert(arr, 7));
        System.out.println("Example 4: " + searchInsert(arr, 0));
    }
}
