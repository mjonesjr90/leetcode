import java.util.*;
import java.util.stream.Collectors;

class Permutations {
    //create a List to hold each permutation
    static List<List<Integer>> holder = new ArrayList<>();

    //use the base method to launch the method that uses recursion
    public static List<List<Integer>> permute(int[] nums) {
        return perm(nums.length, nums);
    }

    //method that takes in a length and an array
    //this allows you to move along the array to swap more easily
    public static List<List<Integer>> perm(int n, int[] arr) {
        //once you reach the base permutation, add it to holder
        if(n == 1) {
        	holder.add(arrToList(arr));
            print(Arrays.stream(arr).boxed().collect(Collectors.toList()));
        }

        //iterate through each permutation until you reach the base permutation
        else{
            for(int i = 0; i < n - 1; i++) {
                //recurse with a smaller "length"
                perm(n - 1, arr);

                //if even, swap the ith element with the last
                if(n % 2 == 0) {
                    swap(arr, i, n - 1);
                }

                //if odd, swap the first element with the last
                else {
                    swap(arr, 0, n - 1);
                }
            }

            //get the last permutation
            perm(n - 1, arr);
        }

        //return the list of permutations
        return holder;
    }

    public static void swap(int[] arr, int beg, int end) {
        int temp = arr[beg];
        arr[beg] = arr[end];
        arr[end] = temp;
    }

    public static List<Integer> arrToList(int[] a) {
        List<Integer> ans = new ArrayList<>();
        for(int i : a) {
            ans.add(i);
        }
        return ans;
    }

    public static void print(List<Integer> a) {
        for(int i = 0; i < a.size(); i++) {
            System.out.print(a.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        List<List<Integer>> x = permute(a);
    }
}
