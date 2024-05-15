package dev.nj.solutions;

public class ReverseString {
    public static String reverse(String str) {
        StringReverser reverser = new StringReverser() {
            @Override
            public String reverse(String str) {
                StringBuilder out = new StringBuilder();
                for (int i = str.length() - 1; i >= 0; i--) {
                    out.append(str.charAt(i));
                }
                return out.toString();
            }
        };
        return reverser.reverse(str);
    }
}
