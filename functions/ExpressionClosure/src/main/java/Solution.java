import java.util.function.DoubleUnaryOperator;

public class Solution {
    private static final int A = 10;
    private static final int B = 20;
    private static final int c = 30;

    public static DoubleUnaryOperator unaryOperator = x -> A * x * x + B * x + c;
}
