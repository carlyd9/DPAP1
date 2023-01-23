public class StandardAccount implements IAccount{

    //State
    int accountNumber;
    double creditLimit;
    double withdrawlLimit;

    //Behaviour
    //Constructor
    public StandardAccount(int accountNumber, double creditLimit){
        this.accountNumber = accountNumber;
        this.creditLimit = creditLimit;
    }

    @Override
    public void Deposit(double amount) {

    }

    double currentBalance;

    public double Withdraw(double amount) {
        if (amount > withdrawlLimit) {
            amount = withdrawlLimit;
        }
        if (amount <= currentBalance) {
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
        return currentBalance;
    }

    @Override
    public int GetAccountNumber() {
        return accountNumber;
    }
}
