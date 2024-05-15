package dev.nj.solutions;

public class ReverseString {
    public static String reverse(String str) {
        StringReverser reverser = str1 -> new StringBuilder(str1).reverse().toString();
        return reverser.reverse(str);
    }
}
