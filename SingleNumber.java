import java.util.*;

class SingleNumber {
    public static int singleNumber(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        else{
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

            //fill map with all of the occurences of each number
            for(int i = 0; i < nums.length; i++) {
                if(map.containsKey(nums[i])) {
                    map.replace(nums[i], 2); //update the stored value to 2
                }
                else {
                    map.put(nums[i], 1); //add the value to the map
                }
            }

            //check for the occurence of 1 in the HashMap
            int ans = 0;
            for(int x = 0; x < nums.length; x++) {
                if(map.get(nums[x]) == 1) {
                    ans = nums[x];
                    break;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        int[] a = {4, 1, 2, 1, 2};
        int[] b = {2, 2, 1};
        System.out.println("SINGLE NUMBER A: " + singleNumber(a));
        System.out.println("SINGLE NUMBER B: " + singleNumber(b));
    }
}
