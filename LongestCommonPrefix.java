/**
Question:
Write a function to find the longest common prefix string amongst an array of
strings.

If there is no common prefix, return an empty string "".

Example 1:
    Input: ["flower","flow","flight"]
    Output: "fl"
Example 2:
    Input: ["dog","racecar","car"]
    Output: ""
    Explanation: There is no common prefix among the input strings.
Note:
    All given inputs are in lowercase letters a-z.
*/

class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        //
        else{
            String ans = "";
            String base = strs[0]; //get first word; used as baseline
            // Get letter from base, compare it to same letter in following words
            outer:
                for(int i = 0;i < base.length(); i++){ //Iterate through letters in first word
                    for(int j = 1;j < strs.length; j++){ //iterate through words in list
                        if(i == strs[j].length() || base.charAt(i) != strs[j].charAt(i)){
                            break outer;
                        }
                    }
                    ans += base.charAt(i); //if for loop runs without breaking - append letter
                }
            return ans;
        }
    }
}
