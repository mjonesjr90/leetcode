/**
Given a string, find the length of the longest substring without repeating
characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", which the length is 3.
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence
             and not a substring.
*/
class LongestSubstringWithoutRepeating {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
        else{
            Map<Character,Character> map = new HashMap<Character,Character>();
            int ans = 0;
            int count = 0;
            int i = 0;
            int start = 0;
            char[] arr = s.toCharArray();
            outer:
                while(i < arr.length){ //iterate through string
                    if(map.get(arr[i]) != null){ //check if char is in map already
                        count = 0; //reset count to 0 if streak is broken
                        map.clear(); //clear map
                        start++; //start from next char
                        if(arr.length - start < ans){
                            break outer; //stop if the remainder isn't long enough to change answer
                        }
                        i = start;
                    }
                    else{
                        map.put(arr[i], arr[i]); //add char to map
                        count++; //increment count
                        if(ans < count){ //ans should be the longest stretch of this
                            ans = count;
                        }
                        i++; //go to the next char
                    }
                }
            return ans;
        }
    }
}
