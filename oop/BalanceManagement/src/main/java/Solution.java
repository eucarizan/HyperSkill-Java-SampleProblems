public class Solution {
    public static String[] changeBalance(Account account, Operation operation, Long sum) {
        boolean changed = false;
        String status = "";
        long balance = account.getBalance();

        if ("DEPOSIT".equals(operation.name())) {
            account.setBalance(balance + sum);
            changed = true;
            status = "Successful operation.";
        } else {
            if (balance >= sum) {
                account.setBalance(balance - sum);
                changed = true;
                status = "Successful operation.";
            } else {
                status = "Not enough money to withdraw.";
            }
        }

        return new String[]{String.valueOf(changed), status};
    }
}
