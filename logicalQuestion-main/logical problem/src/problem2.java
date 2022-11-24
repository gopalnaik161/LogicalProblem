import java.util.Stack;

class problem2 {
    public static boolean isValid(String s) {

        Stack<Character> stackOb = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stackOb.push(c);
            }
               else if (c == ')' && !stackOb.isEmpty() && stackOb.peek() == '(') {
                stackOb.pop();
            }  else if (c == '}' && !stackOb.isEmpty() && stackOb.peek() == '{') {
                stackOb.pop();
            }   else if (c == ']' && !stackOb.isEmpty() && stackOb.peek() == '[') {
                stackOb.pop();
            }
            else {
                return false;
            }
        }
        return stackOb.isEmpty();
    }

    public static void main(String[] args) {



        String s ="([])([)";
        boolean b= isValid(s);
        System.out.println(b);

    }
}


