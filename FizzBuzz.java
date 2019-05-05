import java.util.*;

class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        if(n == 0) {
            return null;
        }
        else {
            List<String> l = new ArrayList<String>();
            for(int i = 1; i <= n; i++) {
                //if the number is not divisible either 3 or 5
                if(i % 3 != 0 && i % 5 != 0) {
                    l.add(Integer.toString(i));
                }
                else {
                    String v = "";
                    if(i % 3 == 0) {
                        v += "Fizz";
                    }
                    if(i % 5 == 0) {
                        v += "Buzz";
                    }
                    l.add(v);
                }
            }
            return l;
        }
    }

    public static void main(String[] args) {
        List<String> a = new ArrayList<String>();
        a = fizzBuzz(15);
        for(int i = 0; i < a.size(); i++) {
            System.out.println(a.get(i));
        }
    }
}
