public class SavingsAccount extends BankAccount {
    public double interestRate;

    public SavingsAccount(String number, Long balance, double interestRate) {
        super(number, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount{" +
                "interestRate=" + interestRate +
                ", number='" + number + '\'' +
                ", balance=" + balance +
                '}';
    }
}
