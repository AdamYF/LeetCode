class Solution {
    public boolean isValid(String s) {
        char arr[] = s.toCharArray();
        int len = s.length();
        Stack<Character> stack = new Stack<>();

        for (char single : arr) {
            if (stack.size() == 0) {
                stack.push(single);
            } else if (isPair(stack.peek(), single)) {
                stack.pop();
            } else {
                stack.push(single);
            }
        }

        return stack.size() == 0;
    }

    private static boolean isPair(char a, char b) {
        // if ((a == '(' && b == ')') ||
        //     (a == '{' && b == '}') ||
        //     (a == '[' && b == ']')) {
        //     return true;
        // } else {
        //     return false;
        // }

        return ((a == '(' && b == ')') ||
                (a == '{' && b == '}') ||
                (a == '[' && b == ']'));
    }
}