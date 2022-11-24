public class NoOfWordsInString {
    public static void main(String[] args) {
        reverseString(" Gopal Naik");
    }
    public static void reverseString(String name) {
        String[] s = name.trim().split(" ");
        System.out.println(s.length);
        for (String x : s) {
            System.out.println(x);
        }
    } }

