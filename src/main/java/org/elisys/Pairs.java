package org.elisys;

import java.util.Stack;


public class Pairs {
    public static void main(String[] args) {
        System.out.println(isPaired("(((("));
    }
    public static boolean isPaired(String brackets){
        if (brackets.length() % 2 !=0) {
            return false;
        }


        Stack<Character> stackOfBrackets = new Stack<>();
        for(Character c:brackets.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stackOfBrackets.add(c);
            } else {
                if ((stackOfBrackets.peek() == '(' && c == ')')  // peek -> '('   c-> ']'
                        || (stackOfBrackets.peek() == '[' && c == ']')
                        || (stackOfBrackets.peek() == '{' && c == '}')) {
                    stackOfBrackets.pop();
                } else {
                    return false;
                }
            }
        }

        return stackOfBrackets.isEmpty();

    }
}
