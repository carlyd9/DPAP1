public class BasicAccount implements IAccount{

    //State
    int accountNumber;
    double currentBalance;
    double withdrawlLimit;
    double creditLimit;

    //Constructors
    public BasicAccount(int accountNumber, double withdrawlLimit){
        this.accountNumber = accountNumber;
        this.withdrawlLimit = withdrawlLimit;
    }

    //behaviour

    @Override
    public void Deposit(double amount) {
        currentBalance += amount; // currentbalance = currentbalance + amounts
    }
    @Override
    public double Withdraw(double amount) {
        double maxWithdrawal = creditLimit - currentBalance;
        if (amount <= maxWithdrawal && amount <= withdrawlLimit) {
            currentBalance -= amount;
            return currentBalance;
        } else if(amount > maxWithdrawal) {
            currentBalance -= maxWithdrawal;
            return currentBalance;
        }
        return maxWithdrawal;
    }
//500<=200 and 500<=300 we will only get

    @Override
    public double GetCurrentBalance() {
        return 0;
    }


    @Override
    public double GetCurrentBalance(double currentBalance) {
        return this.currentBalance;
    }

    @Override
    public int GetAccountNumber() {
        return this.accountNumber;
    }
}
