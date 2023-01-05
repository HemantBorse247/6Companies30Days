package Microsoft;
class Solution {
    private int i;
    String[] tokens;

    public int evalRPN(String[] tokens) {
        i = tokens.length - 1;
        this.tokens = tokens;
        return eval();
    }

    private int eval() {
        String val = tokens[i--];

        switch (val) {
            case "+":
                return eval() + eval();
            case "-":
                return -eval() + eval();
            case "*":
                return eval() * eval();
            case "/":
                int n2 = eval();
                int n1 = eval();
                return n1 / n2;
            default:
                return Integer.parseInt(val);
        }
    }
}