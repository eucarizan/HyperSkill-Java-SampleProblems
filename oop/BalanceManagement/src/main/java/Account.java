public class Account {
    private String code;
    private Long balance;

    public Account(Long balance) {
        this.balance = balance;
    }

    public String getCode() {
        return code;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
