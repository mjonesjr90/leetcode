public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        if(nums.length < 2){
            return nums.length;
        }
        else {
            int pointer = 0;
            int l = 1;
            for(int i = 0; i < nums.length; i++) {
                //If not at the end of th array and the next # is different
                if((i + 1) != nums.length && (nums[i+1]) != nums[i]) {
                    // System.out.println((nums[i+1]) + " is greater than " + nums[i]);
                    pointer++;
                    l++;
                    nums[pointer] = nums[i+1];
                }
            }
            return l;
        }
    }

    public static void main(String[] args) {
        int[] x = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int l = removeDuplicates(x);
        System.out.println(l);

        for(int y = 0; y < l; y++) {
            System.out.print(x[y] + " ");
        }
    }
}
