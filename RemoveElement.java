public class RemveElement {
    public static int removeElement(int[] nums, int val) {
        if(nums == null || nums.length() == 0) {
            return 0;
        }
        else{
            int pointer = 0;
            int l = nums.length();
            boolean dip = false; //delete in progress
            for(int i = 0; i < nums.length(); i++) {
                if(nums[i] != val && dip == false) {
                    pointer = i;
                    dip = true;
                }
            }
        }
    }
}
