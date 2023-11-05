public class Solution {
    public static String createAccount(String account, String number, Long balance, double num) {
        String out = "";

        if ("checking".equalsIgnoreCase(account)) {
            out = new CheckingAccount(number, balance, num).toString();
        } else if ("savings".equalsIgnoreCase(account)) {
            out = new SavingsAccount(number, balance, num).toString();
        }

        return out;
    }
}
