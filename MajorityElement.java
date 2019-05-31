import java.util.*;

class MajorityElement {
    public int majorityElement(int[] nums) {
        if(nums.length ==  1) {
            return nums[0];
        }
        else {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            int majority = 0;

            //count #'s and add them to the HashMap
            for(int i = 0; i < nums.length; i++) {
                if(map.containsKey(nums[i])) {
                    map.replace(nums[i], map.get(nums[i]) + 1);
                    if(map.get(nums[i]) > (nums.length / 2)) {
                        majority = nums[i];
                        break;
                    }
                }
                else {
                    map.put(nums[i], 1);
                }
            }
            return majority;
        }
    }

    public static void main(String[] args) {
        MajorityElement me = new MajorityElement();
        int[] a = {2, 2, 1, 1, 1, 2, 2};
        int[] b = {32,41,21,29,7,53,97,76,71,53,53,53,72,53,53,14,22,53,67,53,53,53,54,98,53,46,53,53,62,53,76,20,60,53,31,53,53,53,95,27,53,53,53,53,36,59,40,53,53,64,53,53,53,21,53,51,53,53,2,53,53,53,53,53,50,53,53,53,23,88,3,53,61,19,53,68,53,35,42,53,53,48,34,54,53,75,53,53,50,44,92,41,71,53,53,82,53,53,14,53};
        System.out.println(me.majorityElement(a));
        System.out.println(me.majorityElement(b));
    }
}
