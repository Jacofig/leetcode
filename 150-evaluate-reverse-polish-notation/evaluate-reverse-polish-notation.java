class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        for (String c : tokens)
        {
            if (!c.equals("+") && !c.equals("-") && !c.equals("*") && !c.equals("/"))
            {
                stack.push(Integer.parseInt(c));
            }
            else {
                if (stack.isEmpty()) return 0;

                int second = stack.pop();
                int first = stack.pop();

                if (c.equals("+")) stack.push(first + second);
                if (c.equals("-")) stack.push(first - second);
                if (c.equals("*")) stack.push(first * second);
                if (c.equals("/")) stack.push(first / second);
            }
        }
        return stack.pop();
    }
}