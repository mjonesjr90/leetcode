/*

Given a string s, find the longest palindromic substring in s. You may assume
that the maximum length of s is 1000.

Example 1:
Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.

Example 2:
Input: "cbbd"
Output: "bb"

Steps:
- Read in String
- Take incrementally larger substrings
- Check if it's a palindrome
- If it's a palindrome, then put it in a holder variable
- Overwrite if longer palindrome is found
- Shift over string
- Once at end, pick larger substring and repeat

Chars will run faster
*/

class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        String longestPal = "";
        String sub = "";
        char[] c = s.toCharArray();
        if(c.length == 1){
            return s;
        }
        else{
            check:
            for(int size = c.length; size > 0; size--){ //gradually decrease string size
                for(int i = 0; i <= (c.length-size); i++){ //iterate forward through string
                    if(isPalindrome(i, i+size, c)){ //check if substring is pal
                        longestPal = "";
                        for(int x = i; x < size; x++){
                            longestPal += c[x];
                            // System.out.println("Sub: "+longestPal);
                        }
                        break check; //stop once a pal is found at current size
                    }
                    // System.out.println("Sub: "+longestPal);
                }
            }
            return longestPal;
        }
    }

    public static boolean isPalindrome(int start, int end, char[] c) {
        int clength = end - start + 1;
        for(int e = start; e < clength/2; e++){
            System.out.println("START: " +c[e]+", END: "+c[end-1-e]);
            if(c[e] != c[end-1-e]){//if the don't match
            System.out.println("NOT PAL");
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        System.out.println("Longest Palindrome: " + longestPalindrome(args[0]));
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("RUNTIME: " + duration + "ms");
    }
}
