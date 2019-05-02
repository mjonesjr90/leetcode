public class ReverseString {
    public static void reverseString(char[] s) {
        if(s != null && s.length >= 2) {
            char temp;
            for(int i = 0; i < s.length/2; i++) {
                temp = s[s.length - 1 - i]; //get the mirror position
                s[s.length - 1 - i] = s[i]; //move current to mirror position
                s[i] = temp; //set the current position to the mirror
            }
        }
        // System.out.println("The reverse of hello is " +print(s));
        print(s);
    }

    public static void print(char[] x) {
        for(int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char[] a = {'h', 'e', 'l', 'l', 'o'};
        reverseString(a);
    }
}
