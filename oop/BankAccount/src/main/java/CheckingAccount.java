public class CheckingAccount extends BankAccount {
    public double fee;

    public CheckingAccount(String number, Long balance, double fee) {
        super(number, balance);
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "fee=" + fee +
                ", number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
