import java.util.*;

class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        if(s.length() == 0) {
            return -1;
        }
        if(s.length() == 1) {
            return 0;
        }
        else {
            // HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            int ans = -1;
            //
            // for(int i = 0; i < s.length(); i++) {
            //     if(map.containsKey(s.charAt(i))) {
            //         map.replace(s.charAt(i), map.get(s.charAt(i)) + 1);
            //     }
            //     else {
            //         map.put(s.charAt(i), 1);
            //     }
            // }
            //
            // for(int i = 0; i < s.length(); i++) {
            //     if(map.get(s.charAt(i)) == 1) {
            //         ans = i;
            //         break;
            //     }
            // }
            // return ans;
            int[] alpha = new int[26];
            for(int i = 0; i < s.length(); i++) {
                alpha[s.charAt(i) - 'a']++;
            }

            for(int i = 0; i < s.length(); i++) {
                if(alpha[i] == 1) {
                    ans = i;
                }
            }

            return ans;
        }
    }

    public static void main(String[] args) {
        FirstUniqueCharacter fuc = new FirstUniqueCharacter();
        String a = "leetcode";
        String b = "loveleetcode";

        System.out.println(a + " first unique is " + fuc.firstUniqChar(a));
        System.out.println(b + " first unique is " + fuc.firstUniqChar(b));
    }
}
