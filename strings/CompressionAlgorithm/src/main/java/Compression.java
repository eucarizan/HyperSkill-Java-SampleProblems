public class Compression {

    public static String compress(String input) {
        StringBuilder sb = new StringBuilder();
        int sum = 1;
        char last = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            char prev = input.charAt(i - 1);
            char ch = input.charAt(i);
            if (prev == ch) {
                sum++;
            } else {
                sb.append(prev);
                sb.append(sum);
                last = ch;
                sum = 1;
            }
        }
        sb.append(last);
        sb.append(sum);
        
        return sb.toString();
    }

    public static String process(String input) {
        int[] arr = new int[52];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                arr[index]++;
            } else if (ch >= 'A' && ch <= 'Z') {
                int index = 26 + ch - 'A';
                arr[index]++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                char ch;
                if (i <= 26) {
                    ch = (char) ('a' + i);
                } else {
                    ch = (char) ('A' + i);
                }
                sb.append(ch);
                sb.append(arr[i]);
            }
        }

        return sb.toString();
    }
}
