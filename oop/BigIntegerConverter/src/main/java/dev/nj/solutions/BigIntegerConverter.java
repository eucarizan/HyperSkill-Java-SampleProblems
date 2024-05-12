package dev.nj.solutions;

import java.math.BigInteger;

public class BigIntegerConverter {
    public static String getBigInteger(String number) {
        Number num = new BigInteger(number);
        return "%s multiplied by 200 is %d".formatted(num, num.intValue() * 200);
    }
}
