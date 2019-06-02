import java.util.*;

class ContainsDuplicates {
    public boolean containsDuplicates(int[] nums) {
        if(nums.length < 2) {
            return false;
        }
        else {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            boolean ans = false;

            for(int i = 0; i < nums.length; i++) {
                if(map.containsKey(nums[i])) {
                    ans = true;
                    break;
                }
                else {
                    map.put(nums[i], 1);
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        ContainsDuplicates cd = new ContainsDuplicates();
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 1};

        if(cd.containsDuplicates(a)) {
            System.out.println("a CONTAINS duplciates");
        }
        else {
            System.out.println("a DOES NOT CONTAIN duplciates");
        }

        if(cd.containsDuplicates(b)) {
            System.out.println("b CONTAINS duplciates");
        }
        else {
            System.out.println("b DOES NOT CONTAIN duplciates");
        }
    }
}
