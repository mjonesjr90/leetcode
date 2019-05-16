import java.util.*;

class TopKFrequentElements {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        if(nums.length == 1) {
            return new ArrayList<>(Arrays.asList(nums[0]));
        }
        else {
            //Determine the highest value and set ArrayList length
            int max = 0;
            for(int i = 0; i < nums.length; i++) {
                if(nums[i] > max) {
                    max = nums[i];
                }
            }
            List<Integer> counter = new ArrayList<Integer>();
            for(int i = 0; i < max + 1; i++) {
                counter.add(0);
            }

            //get the current value at index and add/increment the corresponding
            //index in counter
            for(int i = 0; i < nums.length; i++) {
                if(counter.get(nums[i]) >= 1) {
                    counter.set(nums[i], counter.get(nums[i]) + 1);
                }
                else {
                    counter.set(nums[i], 1);
                }
            }

            //sort the ArrayList and return the top k values
            Collections.sort(counter, Collections.reverseOrder());
            List<Integer> ans = new ArrayList<Integer>();
            for(int i = 0; i < k; i++) {
                ans.add(counter.get(i));
            }
            return ans;
        }
    }

    public static void print(List<Integer> a) {
        for(int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 1, 1, 2, 2, 3};
        print(topKFrequent(a, 2));
    }
}
