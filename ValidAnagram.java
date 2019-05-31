import java.util.*;

class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }
        else {
            char[] x = s.toCharArray();
            char[] y = t.toCharArray();
            boolean ans = true;
            // Arrays.sort(x);
            // Arrays.sort(y);
            // if(Arrays.equals(x, y)) {
            //     return true;
            // }
            // else {
            //     return false;
            //

            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            for(int i = 0; i < x.length; i++) {
                if(map.containsKey(x[i])) {
                    map.replace(x[i], map.get(x[i]) + 1);
                }
                else {
                    map.put(x[i], 1);
                }

                if(map.containsKey(y[i])) {
                    map.replace(y[i], map.get(y[i]) + 1);
                }
                else {
                    map.put(y[i], 1);
                }
            }

            for(int i = 0; i < x.length; i++) {
                if(map.get(x[i]) % 2 != 0) {
                    ans = false;
                    break;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        ValidAnagram va = new ValidAnagram();
        String s = "anagram";
        String t = "nagaram";

        String a = "rat";
        String b = "car";

        if(va.isAnagram(s, t)) {
            System.out.println(s + " and " + t + " are anagrams");
        }
        else {
            System.out.println(s + " and " + t + " are not anagrams");
        }

        if(va.isAnagram(a, b)) {
            System.out.println(a + " and " + b + " are anagrams");
        }
        else {
            System.out.println(a + " and " + b + " are not anagrams");
        }
    }
}
