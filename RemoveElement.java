public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        else{
            int pointer = 0;
            int l = nums.length;
            boolean dip = false; //delete in progress
            for(int i = 0; i < nums.length; i++) {
                //if val to delete is reached and there's no current dip
                System.out.println("Nums[i]: "+nums[i]+", DIP: "+dip+ ", l: "+l);
                if(nums[i] == val && dip == false) {
                    pointer = i; //if val is found, set that location to pointer
                    dip = true; //set delete in progress to true
                    System.out.println("Pointer: "+pointer+", DIP: "+dip);
                }
                //if a val that needs to be copied over is found and dip
                if(nums[i] != val && dip == true) {
                    nums[pointer] = nums[i]; //copy current val to pointer
                    pointer++;
                    //if next value doesn't need to be deleted turn off dip
                    dip = false;
                    // if(nums[pointer] != val) {
                    //     dip = false;
                    // }
                    l--; //decrement length
                    System.out.println("Move: "+nums[i]+ "->["+(pointer-1)+"], Pointer: "+pointer+", DIP: "+dip);
                }

                //if last number is not to be delete - bump up to correct place
                if(nums[i] != val && (i + 1) == nums.length && dip == false) {
                    nums[pointer] = nums[i];
                }
                //if last number is to be delete - decrement length
                if(nums[i] == val && (i + 1) == nums.length && dip == true) {
                    l--;
                }
            }
            return l;
        }
    }
    public static void main(String[] args) {
        int[] x = {0,1,2,2,3,0,4,2};
        int l = removeElement(x, 2);
        System.out.println(l);

        for(int y = 0; y < l; y++) {
            System.out.print(x[y] + " ");
        }
    }
}
