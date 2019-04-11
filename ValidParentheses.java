import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        //Create hashmap for storing parenth and Stack for holding open parenth
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        Stack<Character> holder = new Stack<Character>();

        //Load map with parentheses
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        //Check if s has length 0 or is odd (there will be on wihout match)
        if(s.length() == 0) {
            return true;
        }

        if(s.length() % 2 != 0) {
            return false;
        }

        //Check if s length is 2 and that brackets match
        else if(s.length() == 2) {
            if(map.containsKey(s.charAt(1)) && map.get(s.charAt(1)) == s.charAt(0)) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            //Create char arry and iterate through, adding and deleting matching
            //brackets from the stack
            char[] c = new char[s.length()];

            for(int i = 0; i < s.length(); i++) {
                c[i] = s.charAt(i);

                //If an opening bracket, add it to the stack
                if(map.containsKey(c[i]) == false) {
                    holder.push(c[i]);
                    System.out.println("Pushed: " + c[i]);
                }
                //If closing bracket, see if it matches the last opening bracket
                //on the stack
                else {
                    //Remove from the stack if it matches
                    if(!holder.empty() && map.get(c[i]) == holder.peek()) {
                        holder.pop();
                        System.out.println("Popped: " + c[i]);
                    }

                    //If there is no match, the bracket will remain on the stack
                }
            }

            //After iterating through everything, check if the stack is empty
            //If it is, then all of the brackets had proper matches and it is a
            //valid string
            System.out.println("Stack Size:" + holder.size());
            return holder.empty();
        }

    }

    public static void main(String[] args) {
        String w = "[[";
        String x = "[]";
        String y = "{[]}";
        String z = "([)]";

        System.out.println(w + " is valid: " + isValid(w));
        System.out.println(x + " is valid: " + isValid(x));
        System.out.println(y + " is valid: " + isValid(y));
        System.out.println(z + " is valid: " + isValid(z));
    }
}
