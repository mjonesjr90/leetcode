import java.util.*;

class TopKFrequentElements {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        if(nums.length == 1) {
            return new ArrayList<>(Arrays.asList(nums[0]));
        }
        else {
        	//Count and add numbers to HashMap
        	HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int i = 0; i < nums.length; i++) {
            	map.put(nums[i], map.getOrDefault(nums[i], 1) + 1);
            }

            //Create a max priority queue to sort in order by value in map
            PriorityQueue<Map.Entry<Integer, Integer>> heap = new PriorityQueue<>(Collections.reverseOrder(Comparator.comparing(entry -> entry.getValue())));

            //Iterate through the map and add to the pq you created
            for(Map.Entry<Integer,Integer> entry: map.entrySet()){
                heap.add(entry);
            }

            //Create a list to return
            List<Integer> ans = new ArrayList<Integer>();

            //Iterate through heap, polling (which removes the head) k elements, and appending to list
            for(int i = 0; i < k; i++){
            	Map.Entry<Integer, Integer> ent = heap.poll();
                ans.add(ent.getKey());
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
        int[] a = {1, 1, 2, 2, 2, 3, 3, 3, 3};
        print(topKFrequent(a, 2));
    }
}
