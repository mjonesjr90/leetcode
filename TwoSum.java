/**
Question:
Given an array of integers, return indices of the two numbers such that they
add up to a specific target.

You may assume that each input would have exactly one solution, and you may not
use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

Best Solution:

Go through the array and check to see if the target minus the current number
is in the map, if not add the current number to the map. If it is, you know
the current number and that key/value in the map are your answer.

class Solution {
    public int[] twoSum(int[] nums, int target) {
 int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(map.containsKey(target-nums[i])){
                result[0] = i;
                result[1] = map.get(target-nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
*/

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        /**
            Create nest for loop to iterate over array
            check each combination of number added
            Once target is reached, return the
            corresponding indices
                - Start the second for loop at the second
                index, 1, to avoid adding the same number together
                - i and j can not be the same
                - Break once answer is found
        */

        // create return array
        int[] ans = new int[2];

        // label outer loop to break when ans found
        outer:
            for(int i=0; i < nums.length; i++){
                for(int j=1; j < nums.length; j++){
                    if(((nums[i]+nums[j]) == target) && (i != j)){
                        ans[0] = i;
                        ans[1] = j;
                        break outer;
                    }
                }
            }
        return ans;
    }
}
