import java.util.*;

class FourSumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        if(A.length == 0) {
            return 0;
        }
        else {
            int ans = 0;
            int sum = 0;
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

            // for(int i = 0; i < A.length; i++){
            //     for(int j = 0; j < B.length; j++) {
            //         for (int k = 0; k < C.length; k++) {
            //             for(int l = 0; l < D.length; l++) {
            //                 if(A[i] + B[j] + C[k] + D[l] == 0) {
            //                     ans++;
            //                 }
            //             }
            //         }
            //     }
            // }

            for(int i = 0; i < A.length; i++){
                for(int j = 0; j < B.length; j++) {
                    sum = A[i] + B[j];
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }

            for (int k = 0; k < C.length; k++) {
                for(int l = 0; l < D.length; l++) {
                    sum = C[k] + D[l];
                    //check if there's a match to the negative value in the map
                    //if there is, return the value (which should be 1)
                    //if there's no match, it will just return 0 and the ans
                    //won't be incremented
                    ans += map.getOrDefault(-1 * sum, 0);
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        FourSumII fs2 = new FourSumII();
        int[] a = {1, 2};
        int[] b = {-2, -1};
        int[] c = {-1, 2};
        int[] d = {0 , 2};

        System.out.println("Number of Tuples: " + fs2.fourSumCount(a, b, c, d));
    }
}
