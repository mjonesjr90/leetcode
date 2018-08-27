/**
Question:
    Determine whether an integer is a palindrome. An integer is a palindrome
    when it reads the same backward as forward.

Example 1:
    Input: 121
    Output: true
Example 2:
    Input: -121
    Output: false
    Explanation: From left to right, it reads -121. From right to left, it
    becomes 121-. Therefore it is not a palindrome.
Example 3:
    Input: 10
    Output: false
    Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
Follow up:
    Coud you solve it without converting the integer to a string?
*/

class PalindromeNumber {
    public boolean isPalindrome(int x) {
        // String num = Integer.toString(x);
        // String rev = "";
        // int result;
        // for(int i = 0; i < num.length(); i++){
        //     rev += num.charAt(num.length()-1-i);
        // }
        // if(rev.equals(num)){
        //     return true;
        // }
        // else{
        //     return false;
        // }
        if(x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }
        else {
            int holder = x;
            int counter = 0;
            boolean ans = true;
            // Find length of integer
            // Divide because int rounds
            while(holder > 0){
                holder = holder / 10;
                counter++;
            }
            int[] original = new int[counter];
            int[] reverse = new int[counter];

            holder = x; // Reset holder to x
            for(int i = 0; i < counter; i++){
                reverse[i] = holder % 10; // get last digit
                original[counter - 1 - i] = holder % 10; // get last digit
                holder = holder / 10; // chop off last digit

            }
            for(int i = 0; i < counter; i++){
                if(reverse[i] != original[i]){
                    ans = false;
                    break;
                }
            }
            return ans;
        }
    }
}
