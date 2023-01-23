public class PremiumAccount implements IAccount{


    //State
    int accountNumber;
    double withdrawlLimit;
    @Override
    public void Deposit(double amount) {

    }
    //Constructor
    public PremiumAccount(int accountNumber, double withdrawlLimit){
        this.accountNumber = accountNumber;
        this.withdrawlLimit = withdrawlLimit;
    }

    //behaviour

    double currentBalance;

    @Override
    public double Withdraw(double amount) {
        if (amount <= withdrawlLimit) {
            currentBalance -= amount;
            return currentBalance;
        }

        return amount;
    }
    @Override
    public double GetCurrentBalance() {
        return currentBalance;
    }

    @Override
    public double GetCurrentBalance(double currentBalance) {
        return 0;
    }

    @Override
    public int GetAccountNumber() {
        return accountNumber;
    }
}
