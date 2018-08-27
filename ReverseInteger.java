/**
Question:
Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

Input: 123
Output: 321
Example 2:

Input: -123
Output: -321
Example 3:

Input: 120
Output: 21
Note:
Assume we are dealing with an environment which could only store integers
within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of
this problem, assume that your function returns 0 when the reversed integer
overflows.
*/

class ReverseInteger {
    /**
        Convert integer to String
        Iterate through each char and add it to the beginning of a new String
            - If you come across a - first, add it to the beginning
            - Else check for a zero at the end (ignore if so)
                - Add number if not 0 at the end
        Check for possible integer overflow

    */
    public int reverse(int x) {
        String num = Integer.toString(x);
        String ans = "";
        int result;
        for(int i = 0; i < num.length(); i++){
            //check if at end of negative number
            if(num.charAt(num.length()-1-i) == '-'){
                ans = "-" + ans;
            }
            else{
                if(i == 0 && num.charAt(num.length()-1) == 0){
                    //don't add 0
                }
                else{
                    ans += num.charAt(num.length()-1-i);
                }
            }
        }
        try {
            result = Integer.parseInt(ans);
        } catch (NumberFormatException e) {
            result = 0;
        }
        return result;
    }
}
