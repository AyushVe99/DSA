class Solution {
    public boolean isValid(String s) {

        if (s.length() == 1) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty())
                    return false;

                char item = stack.peek();
                if (item == '(' && s.charAt(i) == ')' || item == '{' && s.charAt(i) == '}'
                        || item == '[' && s.charAt(i) == ']') {
                    stack.pop();
                } else {
                    return false;
                }

            }

        }
        return stack.isEmpty();
    }
}