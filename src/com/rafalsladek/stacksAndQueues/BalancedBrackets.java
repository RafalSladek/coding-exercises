package com.rafalsladek.stacksAndQueues;

public class BalancedBrackets {

    private static char[][] TOKENS = {{'[', ']'}, {'(', ')'}, {'{', '}'}};

    public static boolean solution(String exspression) {
        Stack<Character> stack = new Stack<>();
        for (char term : exspression.toCharArray()) {
            if (isOpeningTerm(term)) {
                stack.push(term);
            } else {
                if (stack.isEmpty() || !matches(stack.pop(), term)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean matches(char openingTerm, char closingTerm) {
        for (char[] pair : TOKENS) {
            if (pair[0] == openingTerm && pair[1] == closingTerm) {
                return true;
            }
        }
        return false;
    }

    private static boolean isOpeningTerm(char term) {
        for (char[] pair : TOKENS) {
            if (pair[0] == term) {
                return true;
            }
        }
        return false;
    }
}
