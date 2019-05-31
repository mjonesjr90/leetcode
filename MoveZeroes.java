class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        if(nums != null && nums.length > 1) {
            int i = 0;
            // for(int i = 0; i < nums.length; i++) {
            while(i < nums.length) {
                if(nums[i] == 0) {
                    moveToEnd(i, nums);
                }
                else {
                    i++;
                }
            }
        }
    }

    public static void moveToEnd(int i, int[] nums) {
        for(int x = i; x < nums.length - 1; x++) {
            int temp = nums[x];
            nums[x] = nums[x + 1];
            nums[x + 1] = temp;
        }
    }

    public static void print(int[] a) {
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 0, 3, 12};
        print(a);
        moveZeroes(a);
        print(a);
    }
}
