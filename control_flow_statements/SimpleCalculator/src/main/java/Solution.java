public class Solution {
    public static String solve(long num1, long num2, String operand) {
        StringBuilder sb = new StringBuilder();
        switch (operand) {
            case "+":
                sb.append(num1 + num2);
                break;
            case "-":
                sb.append(num1 - num2);
                break;
            case "*":
                sb.append(num1 * num2);
                break;
            case "/":
                sb.append(num2 == 0 ? "Division by 0!" : num1 / num2);
                break;
            default:
                sb.append("Unknown operator");
                break;
        }
        return sb.toString();
    }
}
