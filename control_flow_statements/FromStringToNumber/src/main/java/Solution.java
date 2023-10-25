public class Solution {
    public static int numberToString(String number) {
        int num;
        switch (number.toLowerCase()) {
            case "one":
                num = 1;
                break;
            case "two":
                num = 2;
                break;
            case "three":
                num = 2 + 1;
                break;
            case "four":
                num = 2 + 2;
                break;
            case "five":
                num = 2 + 2 + 1;
                break;
            case "six":
                num = 2 + 2 + 2;
                break;
            case "seven":
                num = 2 + 2 + 2 + 1;
                break;
            case "eight":
                num = 2 + 2 + 2 + 2;
                break;
            case "nine":
                num = 2 + 2 + 2 + 2 + 1;
                break;
            default:
                num = 0;
        }
        return num;
    }
}
