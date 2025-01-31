package commonly.asked;

import java.util.Stack;

public class BalancedBracketss { // o(n) -> time complexity

    public static boolean bbTest(String s) {

        Stack<Character> stack = new Stack<>();
        for(int i = 0;i < s.length() ;i ++) {
            if(s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else if(s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']') {
                Character peek = null;
                if (stack.empty()) {
                    return false;
                }
                    peek = stack.peek();


                if ( (peek == '{' && s.charAt(i) == '}') || (peek == '[' && s.charAt(i) == ']') || (peek == '(' && s.charAt(i) == ')') ) {
                    stack.pop();
                } else
                    return false;
            }
        }
        if(stack.empty()) {
            System.out.println("here");
            return true;
        } else {
            return false;
        }

    }
    public static void main(String[] args) {
        String s = "{([])}";
        String s1 = "{()";
        boolean ans = bbTest(s1);
        System.out.println(ans);
    }
}
