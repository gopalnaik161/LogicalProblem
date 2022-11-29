public class NoOfWordsInString {
    public static void main(String[] args) {
         NoOfWordsInString(" Gopal Naik");
    }
    public static void NoOfWordsInString(String name) {
        String[] s = name.trim().split(" ");
        System.out.println(s.length);
        for (String x : s) {
            System.out.println(x);
        }
    } }

